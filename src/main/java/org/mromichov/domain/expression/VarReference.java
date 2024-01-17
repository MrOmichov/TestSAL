package org.mromichov.domain.expression;

import org.mromichov.bytecodegen.ExpressionGenerator;
import org.mromichov.domain.type.Type;

public class VarReference extends Expression {
    private final String varName;

    public VarReference(String varName, Type type) {
        super(type);
        this.varName = varName;
    }

    public String getVarName() {
        return varName;
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }
}
