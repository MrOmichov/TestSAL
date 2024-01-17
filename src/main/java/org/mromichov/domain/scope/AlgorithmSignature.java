package org.mromichov.domain.scope;

import org.mromichov.domain.expression.Parameter;
import org.mromichov.domain.type.Type;

import java.util.Collections;
import java.util.List;

public class AlgorithmSignature {
    private final String name;
    private final List<Parameter> arguments;
    private final Type returnType;

    public AlgorithmSignature(String name, List<Parameter> arguments, Type returnType) {
        this.name = name;
        this.arguments = arguments;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public List<Parameter> getArguments() {
        return Collections.unmodifiableList(arguments);
    }

    public Type getReturnType() {
        return returnType;
    }
}
