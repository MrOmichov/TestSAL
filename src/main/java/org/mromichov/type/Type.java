package org.mromichov.type;

import static org.objectweb.asm.Opcodes.*;

public enum Type {
    INT("цел", "I", ILOAD, IRETURN),
    DOUBLE("вещ", "D", DLOAD, DRETURN),
    CHAR( "сим","C", ILOAD, IRETURN),
    STRING("лит", "Ljava/lang/String;", ALOAD, ARETURN),
    BOOLEAN("лог", "Z", ILOAD, IRETURN),
    VOID("пустота", "V", 0, RETURN);

    private final String textRepresentation;
    private final String descriptor;
    private final int load;
    private final int returning;

    Type(String textRepresentation, String descriptor, int load, int returning) {
        this.textRepresentation = textRepresentation;
        this.descriptor = descriptor;
        this.load = load;
        this.returning = returning;
    }

    public String getTextRepresentation() {
        return textRepresentation;
    }

    public int getLoad() {
        return load;
    }

    public int getReturn() {
        return returning;
    }

    public String getDescriptor() {
        return descriptor;
    }
}
