package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.parsing.domain.Parameter;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;
import org.mromichov.util.TypeResolver;

import java.util.Map;

public class ParameterVisitor extends salBaseVisitor<Parameter> {
    private final Map<String, Variable> memory;
    public ParameterVisitor(Map<String, Variable> memory) {
        this.memory = memory;
    }

    @Override
    public Parameter visitParameter(salParser.ParameterContext ctx) {
        String name = ctx.ID().getText();
        Type type = TypeResolver.getType(ctx.TYPE());
        Parameter parameter = new Parameter(memory.size(), type,"", name);
        memory.put(name, parameter);
        return parameter;
    }
}
