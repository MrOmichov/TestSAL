package org.mromichov.exception;

import org.mromichov.antlr.salParser;
import org.mromichov.domain.scope.AlgorithmSignature;

import java.util.List;

public class BadArgumentsSize extends RuntimeException {
    public BadArgumentsSize(AlgorithmSignature function, List<salParser.ExpressionContext> calledParameters) {
        super("Bad arguments number");
    }
}
