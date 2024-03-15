package org.mromichov.bytecodegen;

import org.mromichov.bytecodegen.instructions.Instruction;
import org.mromichov.bytecodegen.instructions.VarDeclaration;
import org.mromichov.parsing.domain.Algorithm;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.util.List;
import java.util.Queue;

import static org.objectweb.asm.Opcodes.*;

public class BytecodeGenerator {
    public byte[] generateBytecode(List<Algorithm> algorithms, String name) {
        System.out.println("Bytecode generation has started");
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);
        MethodVisitor mv;
               //version, access, name, signature (for generics => Null), super class, super interfaces
        cw.visit(V1_8, ACC_PUBLIC, name, null, "java/lang/Object", null);

        /*
        Реализация main-метода
         */
        {
            mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null); // public static void main

            for (Instruction instruction : algorithms.get(0).getInstructionQueue()) {
                instruction.apply(mv);
            }
            algorithms.remove(0);
            //mv.visitInsn(RETURN);
            mv.visitMaxs(-1, -1);
            mv.visitEnd();
        }

        /*
        Реализация остальных методов
        */
        for (Algorithm algorithm : algorithms) {
            algorithm.accept(cw);
        }

        cw.visitEnd();
        System.out.println("Bytecode generation is over");
        return cw.toByteArray();
    }
}
