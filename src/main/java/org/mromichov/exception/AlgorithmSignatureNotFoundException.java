package org.mromichov.exception;

import org.mromichov.domain.scope.Scope;

public class AlgorithmSignatureNotFoundException extends RuntimeException {
    public AlgorithmSignatureNotFoundException(Scope scope, String algorithmName) {
        super("There is no algorithm " + algorithmName);
    }
}
