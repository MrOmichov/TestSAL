package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.domain.Expression;

public class ExpressionVisitor extends salBaseVisitor<Expression> {
    @Override
    public Expression visitExpression(salParser.ExpressionContext ctx) {
        return new Expression(ctx.getText());
    }
}
