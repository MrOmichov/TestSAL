package org.mromichov.type;

import static org.objectweb.asm.Opcodes.*;

public enum ComparisonSign {
    EQ("=", IFNE, IF_ICMPNE),
    NE("<>", IFEQ, IF_ICMPEQ),
    GT(">", IFLE, IF_ICMPLE),
    LT("<", IFGE, IF_ICMPGE),
    GE(">=", IFLT, IF_ICMPLT),
    LE("<=", IFGT, IF_ICMPGT);

    private final String textRepresentation;
    private final int oppositeZero;
    private final int opposite;
    ComparisonSign(String textRepresentation, int oppositeZero, int opposite) {
        this.textRepresentation = textRepresentation;
        this.oppositeZero = oppositeZero;
        this.opposite = opposite;
    }

    public String getTextRepresentation() {
        return textRepresentation;
    }

    public int getOppositeZero() {
        return oppositeZero;
    }

    public int getOpposite() {
        return opposite;
    }
}
