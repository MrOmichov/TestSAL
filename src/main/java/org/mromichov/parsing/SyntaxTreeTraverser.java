package org.mromichov.parsing;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.mromichov.antlr.salLexer;
import org.mromichov.antlr.salParser;
import org.mromichov.bytecodegen.instructions.Instruction;
import org.mromichov.parsing.domain.Program;
import org.mromichov.visitor.ProgramVisitor;

import java.io.IOException;
import java.util.Queue;

public class SyntaxTreeTraverser {
    public Queue<Instruction> getInstructions(String fileAbsPath) throws IOException {
        CharStream input = CharStreams.fromFileName(fileAbsPath);
        salLexer lexer = new salLexer(input);
        salParser parser = new salParser(new CommonTokenStream(lexer));
        ProgramVisitor programVisitor = new ProgramVisitor();
        salErrorTreeWalkerListener errorListener = new salErrorTreeWalkerListener();
        Program program = programVisitor.visit((salParser.StartContext) parser.start());
        parser.addErrorListener(errorListener);
        parser.start();
        return program.getInstructionQueue();
    }
}
