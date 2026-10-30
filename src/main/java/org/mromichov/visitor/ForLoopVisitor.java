package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.ForLoop;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;

import java.util.List;
import java.util.Map;

public class ForLoopVisitor extends salBaseVisitor<ForLoop> {
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    private final AlgorithmBlockVisitor blockVisitor;

    public ForLoopVisitor(Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
        this.blockVisitor = new AlgorithmBlockVisitor(currentAlgorithm, algorithms);
    }

    @Override
    public ForLoop visitForLoop(salParser.ForLoopContext ctx) {
        Variable var = memory.get(ctx.ID().getText());
        salParser.ExpressionContext startValue = ctx.e1;
        salParser.ExpressionContext endValue = ctx.e2;
        int step;
        if (ctx.STEP() == null) step = 1;
        else step = Integer.parseInt(ctx.e3.getText());

        ForLoop forLoop = new ForLoop(var, memory, startValue, endValue, currentAlgorithm, algorithms, step);
        for (salParser.StatementContext statement : ctx.statement()) {
            forLoop.addInstruction(blockVisitor.visit(statement));
        }
        return forLoop;
    }
}
