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
    private final Algorithm algorithm;
    private final VarDeclarationVisitor varDeclarationVisitor;
    private AssignmentVisitor assignmentVisitor;
    private PrintVisitor printVisitor;
    private AlgorithmCallVisitor algorithmCallVisitor;
    private AlgorithmReturnVisitor algorithmReturnVisitor;
    private List<Algorithm> algorithms;

    public AlgorithmBlockVisitor(Algorithm algorithm, List<Algorithm> algorithms) {
        this.memory = algorithm.getMemory();
        this.algorithm = algorithm;
        this.varDeclarationVisitor = new VarDeclarationVisitor(memory, algorithm, algorithms);
        this.assignmentVisitor = new AssignmentVisitor(memory, algorithm, algorithms);
        this.printVisitor = new PrintVisitor(memory);
        this.algorithmCallVisitor = new AlgorithmCallVisitor(algorithm, algorithms);
        this.algorithmReturnVisitor = new AlgorithmReturnVisitor(algorithm.getReturnType(), memory, algorithm, algorithms);
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

    @Override
    public Instruction visitIfStatement(salParser.IfStatementContext ctx) {
        return new IfStatementVisitor(memory, algorithm, algorithms).visitIfStatement(ctx);
    }

    @Override
    public Instruction visitAlgorithmReturn(salParser.AlgorithmReturnContext ctx) {
        return algorithmReturnVisitor.visitAlgorithmReturn(ctx);
    }
}
