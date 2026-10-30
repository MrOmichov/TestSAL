package org.mromichov.expression;

import org.apache.commons.lang3.StringUtils;
import org.mromichov.antlr.salBaseListener;
import org.mromichov.antlr.salParser;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;
import org.mromichov.visitor.AlgorithmCallVisitor;
import org.objectweb.asm.MethodVisitor;

import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.*;

public class AtomListener extends salBaseListener {
    private final MethodVisitor mv;
    private final Type type;
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;

    public AtomListener(MethodVisitor mv, Type type, Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.mv = mv;
        this.type = type;
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
    }

    @Override
    public void exitNumber(salParser.NumberContext ctx) {
        int val = Integer.parseInt(ctx.getText());
        if (type == Type.INT) {
            if (val >= -1 && val <= 5) {
                mv.visitInsn(3 + val); // ICONST_M1 = 2 ... ICONST_5 = 8 => код операции = 3 + число
            } else if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
                mv.visitIntInsn(BIPUSH, val);
            } else if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
                mv.visitIntInsn(SIPUSH, val);
            } else {
                mv.visitLdcInsn(val);
            }
        } else if (type == Type.DOUBLE) {
            pushDouble(val);
        }
    }

    @Override
    public void exitDoubleNumber(salParser.DoubleNumberContext ctx) {
        double val = Double.parseDouble(ctx.getText());
        pushDouble(val);
    }

    private void pushDouble(int val) {
        if (val == 0 || val == 1) {
            mv.visitInsn(14 + val); // DCONST_0 = 14, DCONST_1 = 15 => код операции = 14 + число
        } else {
            mv.visitLdcInsn(val);
        }
    }

    private void pushDouble(double val) {
        if (val == 0 || val == 1) {
            mv.visitInsn(14 + (int) val); // DCONST_0 = 14, DCONST_1 = 15 => код операции = 14 + число
        } else {
            mv.visitLdcInsn(val);
        }
    }

    @Override
    public void exitParenExpression(salParser.ParenExpressionContext ctx) {
        ExprListener exprListener = new ExprListener(mv, type, memory, currentAlgorithm, algorithms);
        exprListener.exitExpression(ctx.expression());
    }

    @Override
    public void exitString(salParser.StringContext ctx) {
        mv.visitLdcInsn(StringUtils.remove(ctx.STRING().getText(), '"'));
    }

    @Override
    public void exitVariableReference(salParser.VariableReferenceContext ctx) {
        Variable var = memory.get(ctx.ID().getText());
        mv.visitVarInsn(var.getType().getLoad(), var.getIndex());
    }

    @Override
    public void exitAlgorithm_Call(salParser.Algorithm_CallContext ctx) {
        AlgorithmCallVisitor algorithmCallVisitor = new AlgorithmCallVisitor(currentAlgorithm, algorithms);
        algorithmCallVisitor.visitAlgorithmCall(ctx.algorithmCall()).apply(mv);
    }
}
