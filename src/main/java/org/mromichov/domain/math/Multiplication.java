package org.mromichov.domain.math;

import org.mromichov.bytecodegen.ExpressionGenerator;
import org.mromichov.domain.expression.Expression;

public class Multiplication extends ArithmeticExpression {
    public Multiplication(Expression leftExpress, Expression rightExpress) {
        super(leftExpress.getType(),leftExpress,rightExpress);
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
