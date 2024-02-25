package org.mromichov.util;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.mromichov.type.Type;

import java.util.Arrays;

public final class TypeResolver {
    public static Type getType(TerminalNode typeCtx) {
        if (typeCtx == null) return Type.VOID;
        else return Arrays.stream(Type.values())
                .filter(type -> type.getTextRepresentation().equals(typeCtx.getText()))
                .findFirst().get();
    }
}
