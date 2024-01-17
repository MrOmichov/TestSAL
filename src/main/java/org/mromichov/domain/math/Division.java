package org.mromichov.domain.math;

import org.mromichov.bytecodegen.ExpressionGenerator;
import org.mromichov.domain.expression.Expression;

public class Division extends ArithmeticExpression {
    public Division(Expression leftExpress, Expression rightExpress) {
        super(leftExpress.getType(),leftExpress,rightExpress);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
