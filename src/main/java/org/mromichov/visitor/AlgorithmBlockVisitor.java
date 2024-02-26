package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.Instruction;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;

import java.util.List;
import java.util.Map;

public class AlgorithmBlockVisitor extends salBaseVisitor<Instruction> {
    private final Map<String, Variable> memory;
    private final VarDeclarationVisitor varDeclarationVisitor;
    private final AssignmentVisitor assignmentVisitor;
    private final PrintVisitor printVisitor;
    private final AlgorithmCallVisitor algorithmCallVisitor;
    private final List<Algorithm> algorithms;

    public AlgorithmBlockVisitor(Algorithm algorithm, List<Algorithm> algorithms) {
        this.memory = algorithm.getMemory();
        this.varDeclarationVisitor = new VarDeclarationVisitor(memory);
        this.assignmentVisitor = new AssignmentVisitor(memory);
        this.printVisitor = new PrintVisitor(memory);
        this.algorithmCallVisitor = new AlgorithmCallVisitor(algorithm, algorithms);
        this.algorithms = algorithms;
    }

    @Override
    public Instruction visitVariableDeclaration(salParser.VariableDeclarationContext ctx) {
        return varDeclarationVisitor.visitVariableDeclaration(ctx);
    }

    @Override
    public Instruction visitAssignment(salParser.AssignmentContext ctx) {
        return assignmentVisitor.visitAssignment(ctx);
    }

    @Override
    public Instruction visitPrint(salParser.PrintContext ctx) {
        return printVisitor.visitPrint(ctx);
    }

    @Override
    public Instruction visitAlgorithmCall(salParser.AlgorithmCallContext ctx) {
        return algorithmCallVisitor.visitAlgorithmCall(ctx);
    }
}
