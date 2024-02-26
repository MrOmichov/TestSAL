package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Program;
import org.mromichov.parsing.domain.Variable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProgramVisitor extends salBaseVisitor<Program> {
    private final String className;
    public ProgramVisitor(String className) {
        this.className = className;
    }

    @Override
    public Program visitStart(salParser.StartContext ctx) {
        Program program = new Program();
        Map<String, Variable> memory = new HashMap<>();
        AlgorithmVisitor algorithmVisitor = new AlgorithmVisitor(memory, className);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (i == ctx.getChildCount() - 1) {

            } else {
                program.addAlgorithm(algorithmVisitor.visit(ctx.getChild(i)));
            }
        }

        for (Algorithm algorithm : program.getAlgorithms()) {
            List<salParser.StatementContext> statements = algorithm.getBlock().statement();
            AlgorithmBlockVisitor algorithmBlockVisitor = new AlgorithmBlockVisitor(algorithm, program.getAlgorithms());
            for (salParser.StatementContext statement : statements) {
                algorithm.addInstruction(algorithmBlockVisitor.visit(statement));
            }
        }
        return program;
    }
}
