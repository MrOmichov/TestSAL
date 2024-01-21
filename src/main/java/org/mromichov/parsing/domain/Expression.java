package org.mromichov.parsing.domain;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.mromichov.antlr.expression.ExpressionLexer;
import org.mromichov.antlr.expression.ExpressionParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Expression {
    private final String text;
    private final Map<String, Variable> memory;

    public Expression(String text, Map<String, Variable> memory) {
        this.text = text;
        this.memory = memory;
    }

    public String evaluate() {
        final Map<String, Integer> vars = new HashMap<>();
        List<String> keys = memory.keySet().stream().toList();
        for (String key : keys) {
            vars.put(key, Integer.parseInt(memory.get(key).getValue()));
        }
        CharStream input = CharStreams.fromString(text);
        ExpressionLexer lexer = new ExpressionLexer(input);
        ExpressionParser parser = new ExpressionParser(new CommonTokenStream(lexer), vars);
        parser.start();
        return String.valueOf(parser.result);
    }
}