package org.mromichov.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.AlgorithmCall;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmCallVisitor extends salBaseVisitor<AlgorithmCall> {
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    public AlgorithmCallVisitor(Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
    }

    @Override
    public AlgorithmCall visitAlgorithmCall(salParser.AlgorithmCallContext ctx) {
        List<Variable> arguments = new ArrayList<>();
        List<String> argumentsNames = new ArrayList<>();

        // Нахождение вызываемого алгоритма
        Algorithm algorithm = algorithms
                .stream()
                .filter(a -> a.getName().equalsIgnoreCase(ctx.algorithmName().getText()))
                .findFirst()
                .get();
        if (ctx.argumentList() != null) {
            List<salParser.ArgumentContext> argumentsCtx = ctx.argumentList().argument();
            //TODO argument expressions evaluations
            for (salParser.ArgumentContext argumentCtx : argumentsCtx) {
                argumentsNames.add(argumentCtx.getText());
                System.out.println(argumentCtx.getText());
            }
            for (String argument : argumentsNames) {
                argument = StringUtils.replaceEach(argument, new String[]{")"}, new String[]{""});
                arguments.add(currentAlgorithm.getMemory().get(argument));
            }
        } else arguments = null;
        logAlgorithmCallFound(ctx.algorithmName().ID(), algorithm.getName());
        return new AlgorithmCall(algorithm, algorithm.getClassName(), arguments);
    }

    private void logAlgorithmCallFound(TerminalNode nameSymbol, String name) {
        final int line = nameSymbol.getSymbol().getLine();
        final String format = "Успех: алгоритм с названием '%s' был вызван в строке '%s'\n";
        System.out.printf(format, name, line);
    }
}
