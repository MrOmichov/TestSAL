package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.Loop;
import org.mromichov.bytecodegen.instructions.PostconditionLoop;
import org.mromichov.bytecodegen.instructions.PreconditionLoop;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;

import java.util.List;
import java.util.Map;

public class LoopVisitor extends salBaseVisitor<Loop> {
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    public LoopVisitor(Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
    }

    @Override
    public Loop visitPreconditionLoop(salParser.PreconditionLoopContext ctx) {
        return new PreconditionLoopVisitor(memory, currentAlgorithm, algorithms).visitPreconditionLoop(ctx);
    }

    @Override
    public Loop visitPostconditionLoop(salParser.PostconditionLoopContext ctx) {
        return new PostconditionLoopVisitor(memory, currentAlgorithm, algorithms).visitPostconditionLoop(ctx);
    }

    @Override
    public Loop visitForLoop(salParser.ForLoopContext ctx) {
        return super.visitForLoop(ctx);
    }

    @Override
    public Loop visitNTimesLoop(salParser.NTimesLoopContext ctx) {
        return super.visitNTimesLoop(ctx);
    }
}
