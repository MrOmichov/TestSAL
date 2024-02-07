package org.mromichov.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.VarDeclaration;
import org.mromichov.parsing.domain.Expression;
import org.mromichov.parsing.domain.Program;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;

import java.util.Map;

public class AssignmentVisitor extends salBaseVisitor<VarDeclaration> {
    private Map<String, Variable> memory;
    public AssignmentVisitor(Map<String, Variable> memory) {
        this.memory = memory;
    }
    @Override
    public VarDeclaration visitAssignment(salParser.AssignmentContext ctx) {
        final TerminalNode varName = ctx.ID();                                              // Имя переменной
        Variable var = memory.get(varName.getText());

        if (memory.containsKey(varName.getText())) var = memory.get(varName.getText());
        else System.out.printf("Ошибка: переменная '%s' не объявлена", varName.getText());  // Если такая переменная не объявлена

        if (var.getType() == Type.INT) var.setValue(new Expression(ctx.expression().getText(), memory).evaluate());
        else if (var.getType() == Type.STRING) var.setValue(StringUtils.remove(ctx.expression().getText(), '"'));
        logAssignmentStatementFound(varName, var);
        return new VarDeclaration(var);
    }

    private boolean checkingForTypeCompliance(String varType, int varValueType) {
        if (varType.equals("цел") && varValueType == salParser.NUMBER) return false;
        else if (varType.equals("лит") && varValueType == salParser.STRING) return false;
        return true;
    }

    private void logAssignmentStatementFound(TerminalNode varName, Variable var) {
        final int line = varName.getSymbol().getLine();
        final String format = "Успех: значение переменной '%s' было изменено на '%s' в строке '%s'\n";
        System.out.printf(format, varName.getText(), var.getValue(), line);
    }
}
