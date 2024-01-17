package org.mromichov.domain.statement;

import org.mromichov.bytecodegen.StatementGenerator;

public interface Statement extends Node {
    public void accept(StatementGenerator generator);
}
