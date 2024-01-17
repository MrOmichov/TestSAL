package org.mromichov.domain.statement;

import org.mromichov.bytecodegen.StatementGenerator;
import org.mromichov.domain.expression.Expression;

public class VariableDeclarationStatement implements Statement {
    private final String name;
    private final Expression expression;

    public VariableDeclarationStatement(String name, Expression expression) {
        this.expression = expression;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
