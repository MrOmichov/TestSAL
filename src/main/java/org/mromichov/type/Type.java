package org.mromichov.type;

import static org.objectweb.asm.Opcodes.*;

public enum Type {
    INT("цел", "I", ILOAD, ISTORE, IRETURN),
    DOUBLE("вещ", "D", DLOAD, DSTORE, DRETURN),
    CHAR( "сим","C", ILOAD, ISTORE, IRETURN),
    STRING("лит", "Ljava/lang/String;", ALOAD, ASTORE, ARETURN),
    BOOLEAN("лог", "Z", ILOAD, ISTORE, IRETURN),
    VOID("пустота", "V", 0,  ISTORE, RETURN);

    private final String textRepresentation;
    private final String descriptor;
    private final int load;

    private final int store;
    private final int returning;

    Type(String textRepresentation, String descriptor, int load, int store, int returning) {
        this.textRepresentation = textRepresentation;
        this.descriptor = descriptor;
        this.load = load;
        this.store = store;
        this.returning = returning;
    }

    public String getTextRepresentation() {
        return textRepresentation;
    }

    public int getLoad() {
        return load;
    }

    public int getStore() {
        return store;
    }

    public int getReturn() {
        return returning;
    }

    public String getDescriptor() {
        return descriptor;
    }
}
