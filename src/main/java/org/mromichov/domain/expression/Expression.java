package org.mromichov.domain.expression;

import org.mromichov.bytecodegen.ExpressionGenerator;
import org.mromichov.domain.type.Type;

public abstract class Expression {
    private Type type;

    public Expression(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public  abstract void accept(ExpressionGenerator generator);

}
