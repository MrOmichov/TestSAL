package org.mromichov.visitor;

import org.mromichov.Global;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.domain.Algorithm;
import org.mromichov.domain.scope.AlgorithmSignature;
import org.mromichov.domain.scope.Scope;

import java.util.List;
import java.util.stream.Collectors;

public class GlobalVisitor extends salBaseVisitor<Global> {
    private Scope scope;

    @Override
    public Global visitStart(salParser.StartContext ctx) {
        AlgorithmSignatureVisitor algorithmSignatureVisitor = new AlgorithmSignatureVisitor();
        List<salParser.AlgorithmContext> algorithmsCtx = ctx.algorithm();
        scope = new Scope();
        List<AlgorithmSignature> signatures = algorithmsCtx.stream()
                .map(algorithm -> algorithm.algorithmDeclaration().accept(algorithmSignatureVisitor))
                .peek(scope::addSignature)
                .collect(Collectors.toList());
        List<Algorithm> algorithms = algorithmsCtx.stream()
                .map(algorithm -> algorithm.accept(new AlgorithmVisitor(scope)))
                .collect(Collectors.toList());
        return new Global(algorithms);
    }
}
