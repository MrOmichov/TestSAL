package org.mromichov;

import org.mromichov.domain.Algorithm;

import java.util.Collection;
import java.util.List;

public class Global {
    private Collection<Algorithm> algorithms;

    public Global(Collection<Algorithm> algorithms) {
        this.algorithms = algorithms;
    }

    public List<Algorithm> getAlgorithms() {
        return (List<Algorithm>) algorithms;
    }
}
