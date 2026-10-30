package org.mromichov.parsing.domain;

import org.mromichov.type.Type;

public class Variable {
    private int index;
    private Type type;
    private String value;
    private String name;

    public Variable(int index, Type type, String value, String name) {
        this.index = index;
        this.type = type;
        this.value = value;
        this.name = name;
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

    public String getName() {
        return name;
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

    public void setName(String name) {
        this.name = name;
    }
}
