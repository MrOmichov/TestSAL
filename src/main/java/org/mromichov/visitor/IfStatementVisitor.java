package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.IfStatement;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;

import java.util.List;
import java.util.Map;

public class IfStatementVisitor extends salBaseVisitor<IfStatement> {
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    private final AlgorithmBlockVisitor blockVisitor;

    public IfStatementVisitor(Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
        this.blockVisitor = new AlgorithmBlockVisitor(currentAlgorithm, algorithms);
    }

    @Override
    public IfStatement visitIfStatement(salParser.IfStatementContext ctx) {
        String comparisonSign;
        if (ctx.condition().comparisonSign() == null) comparisonSign = null;
        else comparisonSign = ctx.condition().comparisonSign().getText();
        IfStatement ifStatement = new IfStatement(ctx.condition().expression(), comparisonSign, memory, currentAlgorithm, algorithms);
        for (salParser.StatementContext statement : ctx.ifBlock().statement()) {
            ifStatement.addInstruction(blockVisitor.visit(statement));
        }
        return ifStatement;
    }
}
