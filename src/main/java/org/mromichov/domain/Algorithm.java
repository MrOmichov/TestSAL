package org.mromichov.domain;

import org.mromichov.domain.expression.Parameter;
import org.mromichov.domain.scope.Scope;
import org.mromichov.domain.statement.Statement;
import org.mromichov.domain.type.Type;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Algorithm {
    private final String name;
    private final List<Parameter> arguments;
    private final List<Statement> statements;
    private final Type returnType;
    private Scope scope;

    public Algorithm(Scope scope, String name, Type returnType, List<Parameter> arguments, List<Statement> statements) {
        this.scope = scope;
        this.name = name;
        this.arguments = arguments;
        this.statements = statements;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public List<Parameter> getArguments() {
        return Collections.unmodifiableList(arguments);
    }

    public Collection<Statement> getStatements() {
        return Collections.unmodifiableCollection(statements);
    }

    public Scope getScope() {
        return scope;
    }

    public Type getReturnType() {
        return returnType;
    }
}
