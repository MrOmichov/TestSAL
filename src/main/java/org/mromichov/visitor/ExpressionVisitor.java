package org.mromichov.visitor;

import org.antlr.v4.runtime.misc.NotNull;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.domain.expression.*;
import org.mromichov.domain.math.Addition;
import org.mromichov.domain.math.Division;
import org.mromichov.domain.math.Multiplication;
import org.mromichov.domain.math.Subtraction;
import org.mromichov.domain.scope.AlgorithmSignature;
import org.mromichov.domain.scope.LocalVariable;
import org.mromichov.domain.scope.Scope;
import org.mromichov.domain.type.Type;
import org.mromichov.util.TypeChecker;

import java.util.List;
import java.util.stream.Collectors;

public class ExpressionVisitor extends salBaseVisitor<Expression> {
    private Scope scope;

    public ExpressionVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Expression visitVarReference(@NotNull salParser.VarReferenceContext ctx) {
        String varName = ctx.getText();
        LocalVariable localVariable = scope.getLocalVariable(varName);
        return new VarReference(varName, localVariable.getType());
    }

    @Override
    public Expression visitValue(@NotNull salParser.ValueContext ctx) {
        String value = ctx.getText();
        Type type = TypeChecker.getFromValue(ctx.getText());
        return new Value(type, value);
    }

    @Override
    public Expression visitAlgorithmCall(@NotNull salParser.AlgorithmCallContext ctx) {

        String funName = ctx.algorithmName().getText();
        AlgorithmSignature signature = scope.getSignature(funName);
        List<Parameter> signatureParameters = signature.getArguments();
        List<salParser.ExpressionContext> calledParameters = ctx.expressionList(0).expression();
        List<Expression> arguments = calledParameters.stream()
                .map((expressionContext) -> expressionContext.accept(this))
                .collect(Collectors.toList());
        Type returnType = signature.getReturnType();
        return new AlgorithmCall(signature, arguments,null);
    }

    @Override
    public Expression visitADD(@NotNull salParser.ADDContext ctx) {
        salParser.ExpressionContext leftExpression = ctx.expression(0);
        salParser.ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(this);
        Expression rightExpress = rightExpression.accept(this);

        return new Addition(leftExpress, rightExpress);
    }

    @Override
    public Expression visitMULTIPLY(@NotNull salParser.MULTIPLYContext ctx) {
        salParser.ExpressionContext leftExpression = ctx.expression(0);
        salParser.ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(this);
        Expression rightExpress = rightExpression.accept(this);

        return new Multiplication(leftExpress, rightExpress);
    }

    @Override
    public Expression visitSUBSTRACT(@NotNull salParser.SUBSTRACTContext ctx) {
        salParser.ExpressionContext leftExpression = ctx.expression(0);
        salParser.ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(this);
        Expression rightExpress = rightExpression.accept(this);

        return new Subtraction(leftExpress, rightExpress);
    }

    @Override
    public Expression visitDIVIDE(@NotNull salParser.DIVIDEContext ctx) {
        salParser.ExpressionContext leftExpression = ctx.expression(0);
        salParser.ExpressionContext rightExpression = ctx.expression(1);

        Expression leftExpress = leftExpression.accept(this);
        Expression rightExpress = rightExpression.accept(this);

        return new Division(leftExpress, rightExpress);
    }
}
