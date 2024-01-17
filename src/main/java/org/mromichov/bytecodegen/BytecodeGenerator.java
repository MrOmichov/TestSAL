package org.mromichov.bytecodegen;

import org.mromichov.Global;
import org.mromichov.bytecodegen.instructions.Instruction;
import org.mromichov.bytecodegen.instructions.VarDeclaration;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.util.Queue;

import static org.objectweb.asm.Opcodes.*;

public class BytecodeGenerator {
    public byte[] generate(Global global) {
        ClassGenerator classGenerator = new ClassGenerator();
        return classGenerator.generate(global).toByteArray();
    }
}
