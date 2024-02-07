package org.mromichov.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.VarDeclaration;
import org.mromichov.parsing.domain.Expression;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;

import java.util.Map;

public class VarDeclarationVisitor extends salBaseVisitor<VarDeclaration> {
    private Map<String, Variable> memory;
    public VarDeclarationVisitor(Map<String, Variable> memory) {
        this.memory = memory;
    }
    @Override
    public VarDeclaration visitVariableDeclaration(salParser.VariableDeclarationContext ctx) {
        final TerminalNode varName = ctx.ID();                                // Имя переменной
        final String varType = ctx.TYPE().getText();                          // Объявленный тип переменной

        // Значение переменной
        String varValue = "";
        if (varType.equals("цел")) varValue = new Expression(ctx.expression().getText(), memory).evaluate();
        else if (varType.equals("лит")) varValue = StringUtils.remove(ctx.expression().getText(), '"');

        // Тип значения переменной
        Type varValueType = Type.INT;
        if (varType.equals("лит")) varValueType = Type.STRING;

        // final boolean badDeclaredVarType = checkingForTypeCompliance(varType, varValueType);
        /*
        if (badDeclaredVarType) {
            final String errorFormat = "Ошибка: попытка присвоить неверное значение '%s' переменной '%s'\n";
            System.out.printf(errorFormat, varValue.getText(), varName.getText());
        }
        */

        final int varIndex = memory.size();                            // Порядковый номер (индекс) переменной
        //final String varTextValue = varValue.getText();              // Значение переменной в текстовом представлении
        Variable var = new Variable(varIndex, varValueType, varValue);
        memory.put(varName.getText(), var);
        logVarDeclarationStatementFound(varName, var);
        return new VarDeclaration(var);
    }

    private boolean checkingForTypeCompliance(String varType, int varValueType) {
        if (varType.equals("цел") && varValueType == salParser.NUMBER) return false;
        else if (varType.equals("лит") && varValueType == salParser.STRING) return false;
        return true;
    }

    private void logVarDeclarationStatementFound(TerminalNode varName, Variable var) {
        final int line = varName.getSymbol().getLine();
        final String format = "Успех: переменная '%s' со значением '%s' была объявлена в строке '%s'\n";
        System.out.printf(format, varName.getText(), var.getValue(), line);
    }
}
