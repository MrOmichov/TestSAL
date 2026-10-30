package org.mromichov.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.PrintDeclaration;
import org.mromichov.parsing.domain.Expression;
import org.mromichov.parsing.domain.Variable;

import java.util.Map;

public class PrintVisitor extends salBaseVisitor<PrintDeclaration> {
    private Map<String, Variable> memory;
    public PrintVisitor(Map<String, Variable> memory) {
        this.memory = memory;
    }
    @Override
    public PrintDeclaration visitPrint(salParser.PrintContext ctx) {
        final TerminalNode varName = ctx.ID();
        final boolean VarToPrintNotDeclared = !memory.containsKey(varName.getText());
        int numberOfNewlines = 0;                                                   // Количество "нс" (слово для переноса строки) у команды "вывод"
        if (VarToPrintNotDeclared) {
            final String errorFormat = "Ошибка: попытка вывести необъявленную переменную '%s'\n";
            System.out.printf(errorFormat, varName.getText());
        }
        final Variable var = memory.get(varName.getText());
        if (!ctx.NEXTLINE().isEmpty()) {
            numberOfNewlines = ctx.NEXTLINE().size();
        }
        logPrintDeclarationStatementFound(varName, var, numberOfNewlines);
        return new PrintDeclaration(var, numberOfNewlines);
    }

    private void logPrintDeclarationStatementFound(TerminalNode varName, Variable var, int numberOfNewlines) {
        final int line = varName.getSymbol().getLine();
        final String format = "Успех: вывод переменной '%s' со значением '%s' был задан в строке '%s'. Количество переносов строки: %d.\n";
        System.out.printf(format, varName.getText(), var.getValue(), line, numberOfNewlines);
    }
}
