package org.mromichov.domain.scope;

import com.google.common.collect.Lists;
import org.mromichov.exception.AlgorithmSignatureNotFoundException;
import org.mromichov.exception.LocalVariableNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Scope {
    private List<LocalVariable> localVariables;
    private List<AlgorithmSignature> algorithmSignatures;

    public Scope() {
        localVariables = new ArrayList<>();
        algorithmSignatures = new ArrayList<>();
    }

    public Scope(Scope scope) {
        localVariables = new ArrayList<>();
        algorithmSignatures = Lists.newArrayList(scope.algorithmSignatures);
    }

    public void addSignature(AlgorithmSignature signature) {
        algorithmSignatures.add(signature);
    }

    public AlgorithmSignature getSignature(String algorithmName) {
        return algorithmSignatures.stream()
                .filter(signature -> signature.getName().equals(algorithmName))
                .findFirst()
                .orElseThrow(() -> new AlgorithmSignatureNotFoundException(this, algorithmName));
    }

    public void addLocalVariable(LocalVariable localVariable) {
        localVariables.add(localVariable);
    }

    public LocalVariable getLocalVariable(String varName) {
        return localVariables.stream()
                .filter(variable -> variable.getName().equals(varName))
                .findFirst()
                .orElseThrow(() -> new LocalVariableNotFoundException(this, varName));
    }

    public int getLocalVariableIndex(String varName) {
        LocalVariable localVariable = getLocalVariable(varName);
        return localVariables.indexOf(localVariable);
    }

}
