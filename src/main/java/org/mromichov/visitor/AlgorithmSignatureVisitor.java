package org.mromichov.visitor;

import org.antlr.v4.runtime.misc.NotNull;
import org.mromichov.antlr.salBaseVisitor;
import org.mromichov.antlr.salParser;
import org.mromichov.domain.expression.Parameter;
import org.mromichov.domain.scope.AlgorithmSignature;
import org.mromichov.domain.type.Type;
import org.mromichov.util.TypeChecker;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmSignatureVisitor extends salBaseVisitor<AlgorithmSignature> {
    @Override
    public AlgorithmSignature visitAlgorithmDeclaration(@NotNull salParser.AlgorithmDeclarationContext ctx) {
        String functionName = ctx.algorithmName(0).getText();
        List<salParser.AlgorithmArgumentContext> argsCtx = ctx.algorithmArgument();
        List<Parameter> parameters = new ArrayList<>();
        for(int i=0; i<argsCtx.size(); i++) {
            salParser.AlgorithmArgumentContext argCtx = argsCtx.get(i);
            String name = argCtx.ID().getText();
            Type type = TypeChecker.getFromTypeName(argCtx.TYPE());
            Parameter functionParameters = new Parameter(name, type);
            parameters.add(functionParameters);
        }
        Type returnType = TypeChecker.getFromTypeName(ctx.TYPE());
        return new AlgorithmSignature(functionName, parameters, returnType);
    }
}
