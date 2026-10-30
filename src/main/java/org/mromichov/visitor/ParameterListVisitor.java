package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.parsing.domain.Parameter;
import org.mromichov.parsing.domain.Variable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParameterListVisitor extends salBaseVisitor<List<Parameter>> {

    private final Map<String, Variable> memory;
    public ParameterListVisitor(Map<String, Variable> memory) {
        this.memory = memory;
    }

    @Override
    public List<Parameter> visitParameterList(salParser.ParameterListContext ctx) {
        List<salParser.ParameterContext> parametersCtx = ctx.parameter();
        List<Parameter> parameters = new ArrayList<>();
        if (parametersCtx != null) {
            for (salParser.ParameterContext parameterCtx : parametersCtx) {
                parameters.add(parameterCtx.accept(new ParameterVisitor(memory)));
            }
        }
        return parameters;
    }
}
