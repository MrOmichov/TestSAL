package org.mromichov.bytecodegen.instructions;

import org.mromichov.parsing.domain.Variable;
import org.objectweb.asm.MethodVisitor;

import static org.mromichov.antlr.salLexer.NUMBER;
import static org.mromichov.antlr.salLexer.STRING;
import static org.objectweb.asm.Opcodes.*;


public class PrintDeclaration implements Instruction {

    private final Variable var;
    private final int numberOfNewlines;

    public PrintDeclaration(Variable var, int numberOfNewlines) {
        this.var = var;
        this.numberOfNewlines = numberOfNewlines;
    }

    @Override
    public void apply(MethodVisitor mv) {
        final int type = var.getType();
        final int id = var.getId();
        mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;"); // байткод на подключение класса PrintStream
        if (type == NUMBER) {
            mv.visitVarInsn(ILOAD, id); // кладём переменную на стек
            mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "print", "(I)V", false); // байткод на включение метода print
        } else if (type == STRING) {
            mv.visitVarInsn(ALOAD, id); // кладём переменную на стек
            mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "print", "(Ljava/lang/String;)V", false); // байткод на включение метода print
        }
        if (numberOfNewlines != 0) {
            for (int i = 0; i < numberOfNewlines; i++) {
                mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;"); // байткод на подключение класса PrintStream
                mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "()V", false); // перенос строки
            }
        }
    }
}