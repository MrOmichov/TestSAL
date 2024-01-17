package org.mromichov.util;

import org.mromichov.domain.Algorithm;
import org.mromichov.domain.expression.Parameter;
import org.mromichov.domain.scope.AlgorithmSignature;
import org.mromichov.domain.type.Type;

import java.util.Collection;
import java.util.stream.Collectors;

public class DescriptorFactory {
    public static String getMethodDescriptor(Algorithm algorithm) {
        Collection<Parameter> arguments = algorithm.getArguments();
        Type returnType = algorithm.getReturnType();
        return getMethodDescriptor(arguments, returnType);
    }

    public static String getMethodDescriptor(AlgorithmSignature signature) {
        Collection<Parameter> arguments = signature.getArguments();
        Type returnType = signature.getReturnType();
        return getMethodDescriptor(arguments, returnType);
    }

    private static String getMethodDescriptor(Collection<Parameter> arguments, Type returnType) {
        String argumentsDescriptor = arguments.stream()
                .map(argument -> argument.getType().getDescriptor())
                .collect(Collectors.joining("", "(", ")"));
        String returnDescriptor = returnType.getDescriptor();
        return argumentsDescriptor + returnDescriptor;
    }
}
