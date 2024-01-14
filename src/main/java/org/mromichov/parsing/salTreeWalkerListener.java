package org.mromichov.parsing;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.mromichov.antlr.salBaseListener;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.Instruction;
import org.mromichov.bytecodegen.instructions.PrintDeclaration;
import org.mromichov.bytecodegen.instructions.VarDeclaration;
import org.mromichov.domain.Variable;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class salTreeWalkerListener extends salBaseListener {
    Queue<Instruction> instructionQueue = new ArrayDeque<>();
    Map<String, Variable> vars = new HashMap<>();

    public Queue<Instruction> getInstructionQueue() {
        return instructionQueue;
    }

    @Override
    public void exitAssignment(salParser.AssignmentContext ctx) {
        final TerminalNode varName = ctx.ID();                      // Имя переменной
        final String varType = ctx.TYPE().getText();                // Объявленный тип переменной
        final salParser.ValueContext varValue = ctx.value();        // Значение переменной
        final int varValueType = varValue.getStart().getType();     // Тип значения переменной
        final boolean badDeclaredVarType = checkingForTypeCompliance(varType, varValueType);
        if (badDeclaredVarType) {
            final String errorFormat = "Ошибка: попытка присвоить неверное значение '%s' переменной '%s'\n";
            System.out.printf(errorFormat, varValue.getText(), varName.getText());
            return;
        }
        final int varIndex = vars.size();                           // Порядковый номер (индекс) переменной
        final String varTextValue = varValue.getText();             // Значение переменной в текстовом представлении
        Variable var = new Variable(varIndex, varValueType, varTextValue);
        vars.put(varName.getText(), var);
        instructionQueue.add(new VarDeclaration(var));
        logVarDeclarationStatementFound(varName, var);
    }

    @Override
    public void exitPrint(salParser.PrintContext ctx) {
        final TerminalNode varName = ctx.ID();
        final boolean VarToPrintNotDeclared = !vars.containsKey(varName.getText());
        int numberOfNewlines = 0;                                                   // Количество "нс" (слово для переноса строки) у команды "вывод"
        if (VarToPrintNotDeclared) {
            final String errorFormat = "Ошибка: попытка вывести необъявленную переменную '%s'\n";
            System.out.printf(errorFormat, varName.getText());
            return;
        }
        final Variable var = vars.get(varName.getText());
        if (!ctx.NEXTLINE().isEmpty()) {
            numberOfNewlines = ctx.NEXTLINE().size();
        }
        instructionQueue.add(new PrintDeclaration(var, numberOfNewlines));
        logPrintDeclarationStatementFound(varName, var, numberOfNewlines);
    }

    @Override
    public void exitExpression(salParser.ExpressionContext ctx) {
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

    private void logPrintDeclarationStatementFound(TerminalNode varName, Variable var, int numberOfNewlines) {
        final int line = varName.getSymbol().getLine();
        final String format = "Успех: вывод переменной '%s' со значением '%s' был задан в строке '%s'. Количество переносов строки: %d.\n";
        System.out.printf(format, varName.getText(), var.getValue(), line, numberOfNewlines);
    }

}