package org.mromichov.visitor;

import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.AlgorithmReturn;
import org.mromichov.parsing.domain.Algorithm;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;

import java.util.List;
import java.util.Map;

public class AlgorithmReturnVisitor extends salBaseVisitor<AlgorithmReturn> {
    private final Type returnType;
    private final Map<String, Variable> memory;
    private final Algorithm currentAlgorithm;
    private final List<Algorithm> algorithms;
    public AlgorithmReturnVisitor(Type returnType, Map<String, Variable> memory, Algorithm currentAlgorithm, List<Algorithm> algorithms) {
        this.returnType = returnType;
        this.memory = memory;
        this.currentAlgorithm = currentAlgorithm;
        this.algorithms = algorithms;
    }

    @Override
    public AlgorithmReturn visitAlgorithmReturn(salParser.AlgorithmReturnContext ctx) {
        if (ctx == null) {
            return new AlgorithmReturn(Type.VOID);
        } else {
            return new AlgorithmReturn(returnType, ctx.expression(), memory, currentAlgorithm, algorithms);
        }
    }
}
