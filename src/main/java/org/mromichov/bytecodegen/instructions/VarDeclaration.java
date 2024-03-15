package org.mromichov.bytecodegen.instructions;

import org.mromichov.antlr.salParser;
import org.mromichov.expression.ExprListener;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;
import org.objectweb.asm.MethodVisitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.*;

public class VarDeclaration implements Instruction {

    private final Variable var;
    private final salParser.ExpressionContext value;
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    public VarDeclaration(Variable var, salParser.ExpressionContext expressionContext, Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.var = var;
        this.value = expressionContext;
        this.memory = new HashMap<>(memory);
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
    }

    @Override
    public void apply(MethodVisitor mv) {
        ExprListener exprListener = new ExprListener(mv, var.getType(), memory, currentAlgorithm, algorithms);
        final Type type = var.getType();
        exprListener.exitExpression(value);
        mv.visitVarInsn(type.getStore(), var.getIndex());
    }
}
