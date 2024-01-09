package org.mromichov.parsing;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class salErrorTreeWalkerListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        final String errorFormat = "Ошибка в строке %d, символ %d. Подробнее\n%s";
        final String errorMessage = String.format(errorFormat, line, charPositionInLine, msg);
    }
}
