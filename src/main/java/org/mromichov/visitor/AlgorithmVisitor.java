package org.mromichov.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Parameter;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;
import org.mromichov.util.NameTransliteration;
import org.mromichov.util.TypeResolver;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlgorithmVisitor extends salBaseVisitor<Algorithm> {
    private final Map<String, Variable> memory;
    private final String className;

    public AlgorithmVisitor(Map<String, Variable> memory, String className) {
        this.memory = memory;
        this.className = className;
    }

    @Override
    public Algorithm visitAlgorithm(salParser.AlgorithmContext ctx) {
        TerminalNode nameSymbol = ctx.algorithmDeclaration().algorithmName().ID();
        String name = ctx.algorithmDeclaration().algorithmName().getText();
        String transliteratedName = NameTransliteration.transliterate(name);
        Map<String, Variable> memory = new HashMap<>(this.memory);
        Type returnType = TypeResolver.getType(ctx.algorithmDeclaration().TYPE());
        salParser.BlockContext block = ctx.block();
        if (ctx.algorithmDeclaration().parameterList() != null) {
            List<Parameter> parameters = ctx.algorithmDeclaration().parameterList().accept(new ParameterListVisitor(memory));
            logAlgorithmDeclarationFound(nameSymbol, name, transliteratedName, className, returnType);
            return new Algorithm(name, transliteratedName, className, parameters, memory, returnType, block);
        } else {
            logAlgorithmDeclarationFound(nameSymbol, name, transliteratedName, className, returnType);
            return new Algorithm(name, transliteratedName, className, Collections.emptyList(), memory, returnType, block);
        }
    }

    private void logAlgorithmDeclarationFound(TerminalNode nameSymbol, String name, String transliteratedName, String className, Type returnType) {
        final int line = nameSymbol.getSymbol().getLine();
        StringBuilder format = new StringBuilder("Успех: алгоритм с названием '%s' с возвращаемым типом '%s' был объявлен в строке '%s'.\n");
        format.append("Транслитерированное имя: '%s'. Имя класса-владельца: '%s'.\n");
        System.out.printf(format.toString(), name, returnType.getTextRepresentation(), line, transliteratedName, className);
    }
}
