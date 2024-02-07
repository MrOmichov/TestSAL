package org.mromichov.bytecodegen.instructions;

import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.*;
import static org.objectweb.asm.Opcodes.ASTORE;

public class Assignment implements Instruction {

    private final Variable var;
    private final String value;

    public Assignment(Variable var, String value) {
        this.var = var;
        this.value = value;
    }

    @Override
    public void apply(MethodVisitor mv) {
        final Type type = var.getType();
        if (type == Type.INT) {
            int val = Integer.parseInt(var.getValue());
            if (val >= -1 && val <= 5) {
                mv.visitInsn(3 + val); // ICONST_M1 = 2 ... ICONST_5 = 8 => команда = 3 + число
            } else if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
                mv.visitIntInsn(BIPUSH, val);
            } else if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
                mv.visitIntInsn(SIPUSH, val);
            }
            mv.visitVarInsn(ISTORE, var.getIndex());
        } else if (type == Type.STRING) {
            mv.visitLdcInsn(var.getValue());
            mv.visitVarInsn(ASTORE, var.getIndex());
        }
    }
}
