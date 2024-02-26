package org.mromichov.parsing.domain;

import org.mromichov.type.Type;

public class Parameter extends Variable {
    public Parameter(int index, Type type, String value, String name) {
        super(index, type, value, name);
    }

    @Override
    public int getIndex() {
        return super.getIndex();
    }

    @Override
    public Type getType() {
        return super.getType();
    }

    @Override
    public String getValue() {
        return super.getValue();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setIndex(int index) {
        super.setIndex(index);
    }

    @Override
    public void setType(Type type) {
        super.setType(type);
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
