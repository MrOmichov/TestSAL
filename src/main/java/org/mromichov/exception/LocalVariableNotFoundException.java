package org.mromichov.exception;

import org.mromichov.domain.scope.Scope;

public class LocalVariableNotFoundException extends RuntimeException {
    public LocalVariableNotFoundException(Scope scope, String variableName) {
        super("No local variable found for name " + variableName + "found in scope" + scope);
    }
}
