package org.mromichov.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.PreconditionLoop;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;

import java.util.List;
import java.util.Map;

public class PreconditionLoopVisitor extends salBaseVisitor<PreconditionLoop> {
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    private final AlgorithmBlockVisitor blockVisitor;
    public PreconditionLoopVisitor(Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
        this.blockVisitor = new AlgorithmBlockVisitor(currentAlgorithm, algorithms);
    }

    @Override
    public PreconditionLoop visitPreconditionLoop(salParser.PreconditionLoopContext ctx) {
        String comparisonSign;
        if (ctx.condition().comparisonSign() == null) comparisonSign = null;
        else comparisonSign = ctx.condition().comparisonSign().getText();
        PreconditionLoop preconditionLoop = new PreconditionLoop(ctx.condition().expression(), comparisonSign, memory, currentAlgorithm, algorithms);

        int i = 1;
        for (salParser.StatementContext statement : ctx.statement()) {
            preconditionLoop.addInstruction(blockVisitor.visit(statement));
            System.out.println(i);
            ++i;
            preconditionLoop.instructionsSize();
        }

        logLoopFound(ctx.BEGINCYCLE());
        return preconditionLoop;
    }

    private void logLoopFound(TerminalNode loop) {
        final int line = loop.getSymbol().getLine();
        final String format = "Успех: цикл с предусловием был задан в строке '%d'.\n";
        System.out.printf(format, line);
    }
}
