package org.mromichov.bytecodegen.instructions;

import org.mromichov.parsing.domain.Variable;
import org.objectweb.asm.MethodVisitor;

import static org.mromichov.antlr.salLexer.NUMBER;
import static org.mromichov.antlr.salLexer.STRING;
import static org.objectweb.asm.Opcodes.*;


public class PrintDeclaration implements Instruction {

    private Variable var;

    public PrintDeclaration(Variable var) {
        this.var = var;
    }

    @Override
    public void apply(MethodVisitor mv) {
        final int type = var.getType();
        final int id = var.getId();
        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;"); // байткод на подключение класса PrintStream
        if (type == NUMBER) {
            mv.visitVarInsn(ILOAD, id); // кладём переменную на стек
            mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false); // байткод на включение метода print
        } else if (type == STRING) {
            mv.visitVarInsn(ALOAD, id); // кладём переменную на стек
            mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false); // байткод на включение метода print
        }
    }
}