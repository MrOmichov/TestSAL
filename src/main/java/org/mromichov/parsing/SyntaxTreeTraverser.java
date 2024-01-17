package org.mromichov.parsing;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.mromichov.antlr.salLexer;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.Instruction;

import java.io.IOException;
import java.util.Deque;
import java.util.Queue;

public class SyntaxTreeTraverser {
    public void getInstructions(String fileAbsPath) throws IOException {
        CharStream input = CharStreams.fromFileName(fileAbsPath);
        salLexer lexer = new salLexer(input);
        salParser parser = new salParser(new CommonTokenStream(lexer));
                salErrorTreeWalkerListener errorListener = new salErrorTreeWalkerListener();
        parser.addErrorListener(errorListener);
        parser.start();
    }
}
