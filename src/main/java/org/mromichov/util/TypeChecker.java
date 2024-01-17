package org.mromichov.util;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.mromichov.domain.type.BuiltInType;
import org.mromichov.domain.type.ClassType;
import org.mromichov.domain.type.Type;

import java.util.Arrays;
import java.util.Optional;

public class TypeChecker {
    public static Type getFromValue(String value) {
        if (StringUtils.isNumeric(value)) {
            return BuiltInType.INT;
        }
        return BuiltInType.STRING;
    }

    private static Optional<BuiltInType> getBuiltInType(String typeName) {
        return Arrays.stream(BuiltInType.values())
                .filter(type -> type.getName().equals(typeName))
                .findFirst();
    }

    public static Type getFromTypeName(TerminalNode type) {
        String typeName = type.getText();
        if(typeName.equals("java.lang.String")) return BuiltInType.STRING;
        Optional<? extends Type> builtInType = getBuiltInType(typeName);
        if (builtInType.isPresent()) return builtInType.get();
        return new ClassType(typeName);
    }
}
