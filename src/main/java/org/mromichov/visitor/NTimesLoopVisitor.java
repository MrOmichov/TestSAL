package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.NTimesLoop;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;

import java.util.List;
import java.util.Map;

public class NTimesLoopVisitor extends salBaseVisitor<NTimesLoop> {
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    private final AlgorithmBlockVisitor blockVisitor;

    public NTimesLoopVisitor(Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
        this.blockVisitor = new AlgorithmBlockVisitor(currentAlgorithm, algorithms);
    }

    @Override
    public NTimesLoop visitNTimesLoop(salParser.NTimesLoopContext ctx) {
        Variable var = new Variable(memory.size(), Type.INT, "1", "i");
        memory.put(var.getName(), var);
        NTimesLoop nTimesLoop = new NTimesLoop(var, memory, ctx.expression(), currentAlgorithm, algorithms);
        for (salParser.StatementContext statement : ctx.statement()) {
            nTimesLoop.addInstruction(blockVisitor.visit(statement));
        }
        return nTimesLoop;
    }
}
