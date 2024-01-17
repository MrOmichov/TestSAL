package org.mromichov.domain.expression;

import org.mromichov.bytecodegen.ExpressionGenerator;
import org.mromichov.domain.type.Type;

public class Value extends Expression {

    private String value;

    public Value(Type type, String value) {
        super(type);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
