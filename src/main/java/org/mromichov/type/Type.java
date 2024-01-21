package org.mromichov.type;

public enum Type {
    INT("I"),
    DOUBLE("D"),
    CHAR("C"),
    STRING("Ljava/lang/String;"),
    BOOLEAN("Z");

    private final String descriptor;

    Type(String descriptor) {
        this.descriptor = descriptor;
    }

    public String getDescriptor() {
        return descriptor;
    }
}
