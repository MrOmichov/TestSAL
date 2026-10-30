package org.mromichov.bytecodegen.instructions;

import org.mromichov.antlr.salParser;
import org.mromichov.expression.ExprListener;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.ComparisonSign;
import org.mromichov.type.Type;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.GOTO;
import static org.objectweb.asm.Opcodes.IFEQ;

public class PreconditionLoop extends Loop {
    private final List<salParser.ExpressionContext> expressions;
    private final String comparisonSign;
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    public PreconditionLoop(List<salParser.ExpressionContext> expressions, String comparisonSign, Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.expressions = expressions;
        this.comparisonSign = comparisonSign;
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
    }
    @Override
    public void apply(MethodVisitor mv) {
        Label loopBeginLabel = new Label();
        Label loopEndLabel = new Label();
        mv.visitLabel(loopBeginLabel);
        ExprListener exprListener = new ExprListener(mv, Type.INT, memory, currentAlgorithm, algorithms);
        exprListener.exitExpression(expressions.get(0));

        if (expressions.size() > 1) {
            exprListener.exitExpression(expressions.get(1));
            mv.visitJumpInsn(
                    Arrays.stream(ComparisonSign.values())
                            .filter(sign -> sign.getTextRepresentation().equals(comparisonSign))
                            .findFirst()
                            .get()
                            .getOpposite(),
                    loopEndLabel);
        } else {
            mv.visitJumpInsn(IFEQ, loopEndLabel);
        }

        for (Instruction instruction : instructions) instruction.apply(mv);
        mv.visitJumpInsn(GOTO, loopBeginLabel);
        mv.visitLabel(loopEndLabel);
    }

    public void instructionsSize() {
        System.out.println("Размер в цикле: " + instructions.size());
    }
}
