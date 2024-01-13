package org.mromichov.parsing;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.mromichov.antlr.salLexer;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.Instruction;

import java.io.IOException;
import java.util.Queue;

public class SyntaxTreeTraverser {
    public Queue<Instruction> getInstructions(String fileAbsPath) throws IOException {
        CharStream input = CharStreams.fromFileName(fileAbsPath);
        salLexer lexer = new salLexer(input);
        salParser parser = new salParser(new CommonTokenStream(lexer));
        salTreeWalkerListener listener = new salTreeWalkerListener();
        salErrorTreeWalkerListener errorListener = new salErrorTreeWalkerListener();
        parser.addParseListener(listener);
        parser.addErrorListener(errorListener);
        parser.start();
        return listener.getInstructionQueue();
    }
}
