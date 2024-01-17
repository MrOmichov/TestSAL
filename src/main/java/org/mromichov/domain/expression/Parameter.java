package org.mromichov.domain.expression;

import org.mromichov.bytecodegen.ExpressionGenerator;
import org.mromichov.domain.type.Type;

public class Parameter extends Expression {
    private final String name;

    public Parameter(String name, Type type) {
        super(type);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
