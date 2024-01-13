package org.mromichov.bytecodegen.instructions;

import org.mromichov.parsing.domain.Variable;
import org.objectweb.asm.MethodVisitor;

import static org.mromichov.antlr.salLexer.*;
import static org.objectweb.asm.Opcodes.*;

public class VarDeclaration implements Instruction {

    Variable var;
    public VarDeclaration(Variable var) {
        this.var = var;
    }

    @Override
    public void apply(MethodVisitor mv) {
        final int type = var.getType();
        if (type == NUMBER) {
            int val = Integer.parseInt(var.getValue());
            if (val >= -1 && val <= 5) {
                final int opcode = 3 + val; // ICONST_M1 = 2 ... ICONST_5 = 8 => команда = 3 + число
                mv.visitInsn(opcode);
            } else if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
                mv.visitIntInsn(BIPUSH, val);
            } else if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
                mv.visitIntInsn(SIPUSH, val);
            }
            mv.visitVarInsn(ISTORE, var.getId());
        } else if (type == STRING) {
            mv.visitLdcInsn(var.getValue());
            mv.visitVarInsn(ASTORE, var.getId());
        }
    }
}
