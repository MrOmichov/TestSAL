package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.parsing.domain.Program;
import org.mromichov.parsing.domain.Variable;

import java.util.HashMap;
import java.util.Map;

public class ProgramVisitor extends salBaseVisitor<Program> {
    @Override
    public Program visitStart(salParser.StartContext ctx) {
        Program program = new Program();
        Map<String, Variable> memory = new HashMap<>();
        VarDeclarationVisitor varDeclarationVisitor = new VarDeclarationVisitor(memory);
        AssignmentVisitor assignmentVisitor = new AssignmentVisitor(memory);
        PrintVisitor printVisitor = new PrintVisitor(memory);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (i == ctx.getChildCount() - 1) {

            } else {
                if (ctx.getChild(i) instanceof salParser.VariableDeclarationContext)
                    program.addInstruction(varDeclarationVisitor.visit((salParser.VariableDeclarationContext) ctx.getChild(i)));
                else if (ctx.getChild(i) instanceof salParser.AssignmentContext) {
                    program.addInstruction(assignmentVisitor.visit((salParser.AssignmentContext) ctx.getChild(i)));
                }
                else if (ctx.getChild(i) instanceof salParser.PrintContext)
                    program.addInstruction(printVisitor.visit((salParser.PrintContext) ctx.getChild(i)));
            }
        }
        return program;
    }
}
