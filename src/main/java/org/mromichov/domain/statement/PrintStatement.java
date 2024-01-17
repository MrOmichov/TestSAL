package org.mromichov.domain.statement;

import org.mromichov.bytecodegen.StatementGenerator;
import org.mromichov.domain.expression.Expression;

public class PrintStatement implements Statement {
    private Expression expression;

    public PrintStatement(Expression expression) {

        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }


    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
