package org.mromichov.bytecodegen;

import org.mromichov.Global;
import org.mromichov.domain.Algorithm;
import org.objectweb.asm.ClassWriter;

import java.util.List;

import static org.objectweb.asm.Opcodes.*;

public class ClassGenerator {
    private static final int CLASS_VERSION = V1_8;
    private ClassWriter classWriter;

    public ClassGenerator() {
        classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);
    }

    public ClassWriter generate(Global global) {
        String name = "example";
        classWriter.visit(CLASS_VERSION, ACC_PUBLIC + ACC_SUPER,name,null,"java/lang/Object",null);
        List<Algorithm> methods = global.getAlgorithms();
        methods.forEach(algorithm -> new MethodGenerator(classWriter).generate(algorithm));
        classWriter.visitEnd();
        return classWriter;
    }
}
