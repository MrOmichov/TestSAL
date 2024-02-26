package org.mromichov.parsing.domain;

import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.Instruction;
import org.mromichov.type.Type;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.util.*;

import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static org.objectweb.asm.Opcodes.RETURN;

public class Algorithm {
    private final String name;
    private final String transliteratedName;
    private final String className;
    private final List<Parameter> parameters;
    private final Map<String, Variable> memory;
    private final Type returnType;
    private final Queue<Instruction> instructionQueue;
    private final salParser.BlockContext block;

    public Algorithm(String name, String transliteratedName, String className, List<Parameter> parameters, Map<String, Variable> memory, Type returnType, salParser.BlockContext block) {
        this.name = name;
        this.transliteratedName = transliteratedName;
        this.className = className;
        this.parameters = parameters;
        this.memory = memory;
        this.returnType = returnType;
        this.instructionQueue = new ArrayDeque<>();
        this.block = block;
    }

    public String getName() {
        return name;
    }

    public String getTransliteratedName() {
        return transliteratedName;
    }

    public String getClassName() {
        return className;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    public Map<String, Variable> getMemory() {
        return memory;
    }

    public Queue<Instruction> getInstructionQueue() {
        return instructionQueue;
    }

    public void addInstruction(Instruction instruction) {
        instructionQueue.add(instruction);
    }

    public salParser.BlockContext getBlock() {
        return block;
    }

    public String getDescriptor() {
        /*
        Составление дескриптора метода
         */
        StringBuilder descriptorSB = new StringBuilder("(");
        for (Parameter parameter : parameters) {
            descriptorSB.append(parameter.getType().getDescriptor());
        }
        descriptorSB.append(")").append(returnType.getDescriptor());
        return descriptorSB.toString();
    }
    public void accept(ClassWriter cw) {
        // signature — null, because there are no generics
        MethodVisitor mv = cw.visitMethod(ACC_STATIC, transliteratedName, getDescriptor(), null, null);
        mv.visitCode();
        for (Instruction instruction : instructionQueue) {
            instruction.apply(mv);
        }
        mv.visitInsn(returnType.getReturn());
        mv.visitMaxs(-1, -1);
        mv.visitEnd();
    }
}
