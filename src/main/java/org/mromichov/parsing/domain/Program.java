package org.mromichov.parsing.domain;

import org.mromichov.bytecodegen.instructions.Instruction;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;

public class Program {
    private Queue<Instruction> instructionQueue;

    public Program() {
        this.instructionQueue = new ArrayDeque<>();
    }

    public void addInstruction(Instruction instruction) {
        instructionQueue.add(instruction);
    }

    public Queue<Instruction> getInstructionQueue() {
        return instructionQueue;
    }
}
