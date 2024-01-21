package org.mromichov.parsing.domain;

import org.mromichov.type.Type;

public class Variable {
    private int index;
    private Type type;
    private String value;

    public Variable(int index, Type type, String value) {
        this.index = index;
        this.type = type;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public Type getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
