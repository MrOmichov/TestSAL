package org.mromichov.bytecodegen.instructions;

import org.mromichov.antlr.salParser;
import org.mromichov.expression.ExprListener;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;
import org.objectweb.asm.MethodVisitor;

import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.RETURN;

public class AlgorithmReturn implements Instruction {
    private final Type returnType;
    private final salParser.ExpressionContext expressionContext;
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;

    public AlgorithmReturn(Type returnType, salParser.ExpressionContext expressionContext, Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.returnType = returnType;
        this.expressionContext = expressionContext;
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
    }

    public AlgorithmReturn(Type returnType) {
        this.returnType = returnType;
        this.expressionContext = null;
        this.memory = null;
        this.currentAlgorithm = null;
        this.algorithms = null;
    }
    @Override
    public void apply(MethodVisitor mv) {
        if (expressionContext != null) {
            ExprListener exprListener = new ExprListener(mv, returnType, memory, currentAlgorithm, algorithms);
            exprListener.exitExpression(expressionContext);
        }
        mv.visitInsn(returnType.getReturn());
    }
}
