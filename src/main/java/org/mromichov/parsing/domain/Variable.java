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

    public void setIndex(int index) {
        this.index = index;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
