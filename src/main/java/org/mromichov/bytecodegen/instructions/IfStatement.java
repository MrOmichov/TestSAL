package org.mromichov.bytecodegen.instructions;

import org.mromichov.antlr.salParser;
import org.mromichov.expression.ExprListener;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.ComparisonSign;
import org.mromichov.type.Type;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.GOTO;
import static org.objectweb.asm.Opcodes.IFEQ;

public class IfStatement implements Instruction {
    private final List<salParser.ExpressionContext> expressions;
    private final String comparisonSign;
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    private final List<Instruction> ifInstructions;
    private final ArrayList<Instruction> elseInstructions;

    public IfStatement(List<salParser.ExpressionContext> expressions, String comparisonSign, Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.expressions = expressions;
        this.comparisonSign = comparisonSign;
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
        this.ifInstructions = new ArrayList<>();
        this.elseInstructions = new ArrayList<>();
    }

    public void addIfInstruction(Instruction instruction) {
        ifInstructions.add(instruction);
    }

    public void addElseInstruction(Instruction instruction) {
        elseInstructions.add(instruction);
    }

    @Override
    public void apply(MethodVisitor mv) {
        /*
        Type.INT — заглушка здесь TODO добавить проверку типа на месте
         */
        ExprListener exprListener = new ExprListener(mv, Type.INT, memory, currentAlgorithm, algorithms);
        exprListener.exitExpression(expressions.get(0));
        Label ifEndLabel = new Label(); // label used either for instructions after incomplete branching or for else instructions

        if (expressions.size() > 1) {
            exprListener.exitExpression(expressions.get(1));
            mv.visitJumpInsn(
                    Arrays.stream(ComparisonSign.values())
                    .filter(sign -> sign.getTextRepresentation().equals(comparisonSign))
                    .findFirst()
                    .get()
                    .getOpposite(),
                    ifEndLabel);
        } else {
            mv.visitJumpInsn(IFEQ, ifEndLabel);
        }

        // if instructions
        for (Instruction instruction : ifInstructions) instruction.apply(mv);

        if (!elseInstructions.isEmpty()) {
            Label labelAfterElse = new Label();
            mv.visitJumpInsn(GOTO, labelAfterElse); // jump to instructions after else
            mv.visitLabel(ifEndLabel);

            // else instructions
            for (Instruction instruction : elseInstructions) instruction.apply(mv);
            mv.visitLabel(labelAfterElse);
        } else mv.visitLabel(ifEndLabel);
    }
}
