package org.mromichov.domain.math;

import org.mromichov.bytecodegen.ExpressionGenerator;
import org.mromichov.domain.expression.Expression;

public class Subtraction extends ArithmeticExpression {
    public Subtraction(Expression leftExpress, Expression rightExpress) {
        super(leftExpress.getType(),leftExpress,rightExpress);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
