package org.mromichov.expression;

import org.mromichov.antlr.salBaseListener;
import org.mromichov.antlr.salParser;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;
import org.objectweb.asm.MethodVisitor;

import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.IADD;
import static org.objectweb.asm.Opcodes.ISUB;

public class ExprListener extends salBaseListener {
    private final MethodVisitor mv;
    private final Type type;
    private final Map<String, Variable> memory;

    public ExprListener(MethodVisitor mv, Type type, Map<String, Variable> memory) {
        this.mv = mv;
        this.type = type;
        this.memory = memory;
    }
    @Override
    public void exitExpression(salParser.ExpressionContext ctx) {
        TermListener termListener = new TermListener(mv, type, memory);
        if (ctx.term().size() - ctx.termSign().size() != 1) System.exit(1);
        ctx.term(0).exitRule(termListener);
        if (ctx.term().size() > 1) {
            List<salParser.TermContext> termCtx = ctx.term();
            termCtx.remove(0);
            for (int i = 0; i < termCtx.size(); i++) {
                termCtx.get(i).exitRule(termListener);
                if (ctx.termSign(i).getText().equalsIgnoreCase("+")) mv.visitInsn(IADD);
                else if (ctx.termSign(i).getText().equalsIgnoreCase("-")) mv.visitInsn(ISUB);
            }
        }
    }
}
