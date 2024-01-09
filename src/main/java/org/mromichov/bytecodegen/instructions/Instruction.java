package org.mromichov.bytecodegen.instructions;

import org.objectweb.asm.MethodVisitor;

public interface Instruction {
    void apply(MethodVisitor mv);
}
