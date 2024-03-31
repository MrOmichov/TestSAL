package org.mromichov.bytecodegen.instructions;

import org.objectweb.asm.MethodVisitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Loop implements Instruction {
    final List<Instruction> instructions;

    public Loop() {
        this.instructions = new ArrayList<>();
    }

    public void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }
}
