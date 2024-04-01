package org.mromichov.bytecodegen.instructions;

import org.mromichov.antlr.salParser;
import org.mromichov.expression.ExprListener;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.GOTO;
import static org.objectweb.asm.Opcodes.IF_ICMPGT;

public class NTimesLoop extends Loop {
    private final Variable var;
    private final Map<String, Variable> memory;
    private final salParser.ExpressionContext number;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;

    public NTimesLoop(Variable var, Map<String, Variable> memory, salParser.ExpressionContext number, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.var = var;
        this.memory = memory;
        this.number = number;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
    }

    @Override
    public void apply(MethodVisitor mv) {
        new VarDeclaration(var, memory, currentAlgorithm, algorithms).apply(mv);
        Label beginLabel = new Label();
        Label endLabel = new Label();
        mv.visitLabel(beginLabel);
        mv.visitVarInsn(var.getType().getLoad(), var.getIndex());
        new ExprListener(mv, var.getType(), memory, currentAlgorithm, algorithms).exitExpression(number);
        mv.visitJumpInsn(IF_ICMPGT, endLabel);
        for (Instruction instruction : instructions) instruction.apply(mv);
        mv.visitIincInsn(var.getIndex(), 1);
        mv.visitJumpInsn(GOTO, beginLabel);
        mv.visitLabel(endLabel);
    }
}
