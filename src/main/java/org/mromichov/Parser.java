package org.mromichov;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.mromichov.antlr.salLexer;
import org.mromichov.antlr.salParser;

import org.mromichov.parsing.salErrorTreeWalkerListener;
import org.mromichov.visitor.GlobalVisitor;

import java.io.IOException;

public class Parser {
    public Global getGlobal(String fileAbsPath) throws IOException {
        CharStream input = CharStreams.fromFileName(fileAbsPath);
        salLexer lexer = new salLexer(input);
        salParser parser = new salParser(new CommonTokenStream(lexer));

        ANTLRErrorListener errorListener = new salErrorTreeWalkerListener(); //salErrorTreeWalkerListener - handles parse tree visiting error events
        parser.addErrorListener(errorListener);

        return parser.start().accept(new GlobalVisitor());
    }
}
