package org.mromichov.bytecodegen;

import org.mromichov.domain.Algorithm;
import org.mromichov.domain.scope.Scope;
import org.mromichov.domain.statement.Statement;
import org.mromichov.util.DescriptorFactory;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.util.Collection;

import static org.objectweb.asm.Opcodes.*;

public class MethodGenerator {
    private final ClassWriter classWriter;

    public MethodGenerator(ClassWriter classWriter) {
        this.classWriter = classWriter;
    }

    public void generate(Algorithm algorithm) {
        Scope scope = algorithm.getScope();
        String name = algorithm.getName();
        String description = DescriptorFactory.getMethodDescriptor(algorithm);
        Collection<Statement> instructions = algorithm.getStatements();
        int access = ACC_PUBLIC + ACC_STATIC; //(function.getName().equals("main") ? Opcodes.ACC_STATIC : 0);
        MethodVisitor mv = classWriter.visitMethod(access, name, description, null, null);
        mv.visitCode();
        StatementGenerator statementScopeGenerator = new StatementGenerator(mv, scope);
        instructions.forEach(instruction -> instruction.accept(statementScopeGenerator));
        mv.visitInsn(RETURN);
        mv.visitMaxs(-1,-1);
        mv.visitEnd();
    }
}
