package org.mromichov.domain.expression;

import org.mromichov.bytecodegen.ExpressionGenerator;
import org.mromichov.bytecodegen.StatementGenerator;
import org.mromichov.domain.scope.AlgorithmSignature;
import org.mromichov.domain.statement.Statement;
import org.mromichov.domain.type.Type;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

public class AlgorithmCall extends Expression implements Statement {
    private Type owner;
    private AlgorithmSignature signature;
    private Collection<Expression> parameters;

    public AlgorithmCall(AlgorithmSignature signature, Collection<Expression> parameters, Type owner) {
        super(signature.getReturnType());
        this.signature = signature;
        this.parameters = parameters;
        this.owner = owner;
    }

    public String getAlgorithmName() {
        return signature.getName();
    }

    public Collection<Expression> getParameters() {
        return Collections.unmodifiableCollection(parameters);
    }

    public Optional<Type> getOwner() {
        return Optional.ofNullable(owner);
    }

    public AlgorithmSignature getSignature() {
        return signature;
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}
