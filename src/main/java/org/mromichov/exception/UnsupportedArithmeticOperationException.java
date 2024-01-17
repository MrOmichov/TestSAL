package org.mromichov.exception;

import org.mromichov.domain.expression.Expression;
import org.mromichov.domain.math.ArithmeticExpression;

public class UnsupportedArithmeticOperationException extends RuntimeException {
    public UnsupportedArithmeticOperationException(ArithmeticExpression expression) {
        super(prepareMessage(expression));
    }

    private static String prepareMessage(ArithmeticExpression expression) {
        Expression leftExpression = expression.getLeftExpression();
        Expression rightExpression = expression.getRightExpression();
        return "Unsupported arithmetic operation between " + leftExpression + " and " + rightExpression;
    }
}
