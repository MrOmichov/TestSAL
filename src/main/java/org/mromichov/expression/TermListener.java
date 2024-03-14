package org.mromichov.expression;

import org.mromichov.antlr.salBaseListener;
import org.mromichov.antlr.salParser;
import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;
import org.objectweb.asm.MethodVisitor;

import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.IDIV;
import static org.objectweb.asm.Opcodes.IMUL;

public class TermListener extends salBaseListener {
    private final MethodVisitor mv;
    private final Type type;
    private final Map<String, Variable> memory;

    public TermListener(MethodVisitor mv, Type type, Map<String, Variable> memory) {
        this.mv = mv;
        this.type = type;
        this.memory = memory;
    }
    @Override
    public void exitTerm(salParser.TermContext ctx) {
        AtomListener atomListener = new AtomListener(mv, type, memory);
        ctx.atom(0).exitRule(atomListener);
        if (ctx.atom().size() > 1) {
            List<salParser.AtomContext> atomCtx = ctx.atom();
            atomCtx.remove(0);
            for (int i = 0; i < atomCtx.size(); i++) {
                atomCtx.get(i).exitRule(atomListener);
                if (ctx.atomSign(i).getText().equalsIgnoreCase("*")) mv.visitInsn(IMUL);
                else if (ctx.atomSign(i).getText().equalsIgnoreCase("/")) mv.visitInsn(IDIV);
            }
        }
    }
}
