package org.mromichov.bytecodegen.instructions;

import org.mromichov.antlr.salParser;
import org.mromichov.expression.ExprListener;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.*;

public class ForLoop extends Loop {
    private final Variable var;
    private final Map<String, Variable> memory;
    private final salParser.ExpressionContext startValue;
    private final salParser.ExpressionContext endValue;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    private final int step;
    public ForLoop(Variable var, Map<String, Variable> memory, salParser.ExpressionContext startValue, salParser.ExpressionContext endValue, Algorithm currentAlgorithm, List<Algorithm> algorithms, int step) {
        this.var = var;
        this.memory = memory;
        this.startValue = startValue;
        this.endValue = endValue;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
        this.step = step;
    }

    @Override
    public void apply(MethodVisitor mv) {
        new VarDeclaration(var, startValue, memory, currentAlgorithm, algorithms).apply(mv);
        Label beginLabel = new Label();
        Label endLabel = new Label();
        mv.visitLabel(beginLabel);
        mv.visitVarInsn(var.getType().getLoad(), var.getIndex());
        new ExprListener(mv, var.getType(), memory, currentAlgorithm, algorithms).exitExpression(endValue);
        if (step > 0) mv.visitJumpInsn(IF_ICMPGT, endLabel);
        else mv.visitJumpInsn(IF_ICMPLT, endLabel);
        for (Instruction instruction : instructions) instruction.apply(mv);
        mv.visitIincInsn(var.getIndex(), step);
        mv.visitJumpInsn(GOTO, beginLabel);
        mv.visitLabel(endLabel);
    }
}
