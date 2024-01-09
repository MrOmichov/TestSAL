package org.mromichov.bytecodegen;

import org.mromichov.bytecodegen.instructions.Instruction;
import org.mromichov.bytecodegen.instructions.VarDeclaration;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.util.Queue;

import static org.objectweb.asm.Opcodes.*;

public class BytecodeGenerator {
    public byte[] generateBytecode(Queue<Instruction> instructionQueue, String name) {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        MethodVisitor mv;
                //version, access, name, signature (for generics => Null), super class, interfaces
        cw.visit(V1_8, ACC_PUBLIC, name, null, "java/lang/Object", null);
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null); // public static void main
            final long localVarsCount = instructionQueue.stream().filter(instruction -> instruction instanceof VarDeclaration).count();

            for (Instruction instruction : instructionQueue) {
                instruction.apply(mv);
            }
            mv.visitInsn(RETURN);
            mv.visitMaxs(-1, -1);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}
