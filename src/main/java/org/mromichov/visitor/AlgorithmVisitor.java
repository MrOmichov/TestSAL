package org.mromichov.visitor;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.domain.Algorithm;
import org.mromichov.domain.expression.Parameter;
import org.mromichov.domain.scope.LocalVariable;
import org.mromichov.domain.scope.Scope;
import org.mromichov.domain.statement.Statement;
import org.mromichov.domain.type.Type;
import org.mromichov.util.TypeChecker;

import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmVisitor extends salBaseVisitor<Algorithm> {
    private Scope scope;
    public AlgorithmVisitor(Scope scope) {
        this.scope = new Scope(scope);
    }

    @Override
    public Algorithm visitAlgorithm(@NotNull salParser.AlgorithmContext ctx) {
        String name = getName(ctx);
        Type returnType = getReturnType(ctx);
        List<Parameter> arguments = getArguments(ctx);
        List<Statement> instructions = getStatements(ctx);
        return new Algorithm(scope,name,returnType,arguments,instructions);
    }

    private String getName(salParser.AlgorithmContext algorithmDeclarationContext) {
        return algorithmDeclarationContext.algorithmDeclaration().algorithmName(0).getText();
    }

    private Type getReturnType(salParser.AlgorithmContext algorithmDeclarationContext) {
        TerminalNode type = algorithmDeclarationContext.algorithmDeclaration().TYPE();
        return TypeChecker.getFromTypeName(type);
    }

    private List<Parameter> getArguments(salParser.AlgorithmContext functionDeclarationContext) {
        List<salParser.AlgorithmArgumentContext> argsCtx = functionDeclarationContext.algorithmDeclaration().algorithmArgument();
        List<Parameter> parameters = argsCtx.stream()
                .map(paramCtx -> new Parameter(paramCtx.ID().getText(), TypeChecker.getFromTypeName(paramCtx.TYPE())))
                .peek(param -> scope.addLocalVariable(new LocalVariable(param.getName(), param.getType())))
                .collect(Collectors.toList());
        return parameters;
    }

    private List<Statement> getStatements(@NotNull salParser.AlgorithmContext ctx) {
        StatementVisitor statementVisitor = new StatementVisitor(scope);
        return ctx.blockStatement().stream()
                .map(block -> block.accept(statementVisitor))
                .collect(Collectors.toList());
    }
}
