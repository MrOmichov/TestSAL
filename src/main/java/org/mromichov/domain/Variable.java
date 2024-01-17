package org.mromichov.domain;

import org.mromichov.Type;

public abstract class Variable {
    private final int id;
    private final String name;
    private final Type type;
    private final String value;

    protected Variable(int id, String name, Type type, String value) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
