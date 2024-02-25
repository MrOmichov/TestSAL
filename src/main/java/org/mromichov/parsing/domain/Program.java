package org.mromichov.parsing.domain;

import org.mromichov.bytecodegen.instructions.Instruction;

import java.util.*;

public class Program {
    private List<Algorithm> algorithms;

    public Program() {
        this.algorithms = new ArrayList<>();
    }

    public void addAlgorithm(Algorithm algorithm) {
        algorithms.add(algorithm);
    }

    public List<Algorithm> getAlgorithms() {
        return algorithms;
    }

}
