package org.mromichov.bytecodegen.instructions;

import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;
import org.objectweb.asm.MethodVisitor;

import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.INVOKESTATIC;

public class AlgorithmCall implements Instruction {
    private final String className;
    private final String algorithmName;
    private final List<Variable> arguments;
    private final String descriptor;
    private final Map<String, Variable> memory;
    public AlgorithmCall(Algorithm algorithm, String className, List<Variable> arguments) {
        this.className = className;
        this.algorithmName = algorithm.getTransliteratedName();
        this.arguments = arguments;
        this.descriptor = algorithm.getDescriptor();
        this.memory = algorithm.getMemory();
    }
    @Override
    public void apply(MethodVisitor mv) {
        if (arguments != null) {
            pushArguments(mv);
        }
        mv.visitMethodInsn(INVOKESTATIC, className, algorithmName, descriptor, false);
    }

    private void pushArguments(MethodVisitor mv) {
        for (Variable argument : arguments) {
            mv.visitVarInsn(argument.getType().getLoad(), argument.getIndex());
        }
    }
}
