package org.mromichov.domain.math;

import org.mromichov.exception.UnsupportedArithmeticOperationException;
import org.mromichov.domain.expression.Expression;
import org.mromichov.domain.type.BuiltInType;
import org.mromichov.domain.type.Type;

public abstract class ArithmeticExpression extends Expression {

    private Expression leftExpression;
    private Expression rightExpression;

    public ArithmeticExpression(Type type, Expression leftExpression, Expression rightExpression) {
        super(type);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        if(type != BuiltInType.INT) {
            throw new UnsupportedArithmeticOperationException(this);
        }
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }
}
