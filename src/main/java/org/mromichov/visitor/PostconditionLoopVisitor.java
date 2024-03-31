package org.mromichov.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.PostconditionLoop;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;

import java.util.List;
import java.util.Map;

public class PostconditionLoopVisitor extends salBaseVisitor<PostconditionLoop>  {
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    private final AlgorithmBlockVisitor blockVisitor;
    public PostconditionLoopVisitor(Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
        this.blockVisitor = new AlgorithmBlockVisitor(currentAlgorithm, algorithms);
    }

    @Override
    public PostconditionLoop visitPostconditionLoop(salParser.PostconditionLoopContext ctx) {
        String comparisonSign;
        if (ctx.condition().comparisonSign() == null) comparisonSign = null;
        else comparisonSign = ctx.condition().comparisonSign().getText();
        PostconditionLoop postconditionLoop = new PostconditionLoop(ctx.condition().expression(), comparisonSign, memory, currentAlgorithm, algorithms);

        for (salParser.StatementContext statement : ctx.statement()) {
            postconditionLoop.addInstruction(blockVisitor.visit(statement));
        }

        logLoopFound(ctx.BEGINCYCLE());
        return postconditionLoop;
    }

    private void logLoopFound(TerminalNode loop) {
        final int line = loop.getSymbol().getLine();
        final String format = "Успех: цикл с постусловием был задан в строке '%d'.\n";
        System.out.printf(format, line);
    }
}
