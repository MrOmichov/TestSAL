package org.mromichov.visitor;

import org.antlr.v4.runtime.misc.NotNull;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.domain.expression.Expression;
import org.mromichov.domain.scope.LocalVariable;
import org.mromichov.domain.scope.Scope;
import org.mromichov.domain.statement.PrintStatement;
import org.mromichov.domain.statement.Statement;
import org.mromichov.domain.statement.VariableDeclarationStatement;

public class StatementVisitor extends salBaseVisitor<Statement> {
    private Scope scope;

    public StatementVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Statement visitPrintStatement(@NotNull salParser.PrintStatementContext ctx) {
        salParser.ExpressionContext expressionCtx = (salParser.ExpressionContext) ctx.expression();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(scope);
        Expression expression = expressionCtx.accept(expressionVisitor);
        return new PrintStatement(expression);
    }

    @Override
    public Statement visitVariableDeclaration(@NotNull salParser.VariableDeclarationContext ctx) {
        String varName = ctx.name().getText();
        salParser.ExpressionContext expressionCtx = ctx.expression();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(scope);
        Expression expression = expressionCtx.accept(expressionVisitor);
        scope.addLocalVariable(new LocalVariable(varName, expression.getType()));
        return new VariableDeclarationStatement(varName, expression);
    }

    @Override
    public Statement visitAlgorithmCall(@NotNull salParser.AlgorithmCallContext ctx) {
        return (Statement) ctx.accept(new ExpressionVisitor(scope));
    }
}
