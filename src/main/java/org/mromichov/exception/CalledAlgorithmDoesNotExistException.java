package org.mromichov.exception;

import org.mromichov.domain.expression.AlgorithmCall;
import org.mromichov.domain.scope.Scope;

public class CalledAlgorithmDoesNotExistException extends CompilationException {
    AlgorithmCall algorithmCall;

    public CalledAlgorithmDoesNotExistException(AlgorithmCall algorithmCall) {
        this.algorithmCall = algorithmCall;
    }

    public CalledAlgorithmDoesNotExistException(AlgorithmCall algorithmCall, ReflectiveOperationException e) {
        this(algorithmCall);
    }

    public CalledAlgorithmDoesNotExistException(AlgorithmCall algorithmCall, Scope scope) {
        this(algorithmCall);
    }

    @Override
    public String getMessage() {
        return "Algorithm call" + algorithmCall.toString() + "does not exist";
    }
}
