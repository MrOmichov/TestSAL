package org.mromichov;

import org.abego.treelayout.internal.util.java.lang.string.StringUtil;
import org.apache.commons.io.IOUtils;
import org.mromichov.bytecodegen.BytecodeGenerator;
import org.mromichov.bytecodegen.instructions.Instruction;
import org.mromichov.exception.CompilationException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class Compiler {

    //private static final Logger LOGGER = LoggerFactory.getLogger(Compiler.class);

    public static void main(String[] args) throws Exception {
        try {
            new Compiler().compile(args);
        } catch (CompilationException exception) {
            System.out.println(exception.getClass().getName() + exception.getMessage());
        }
    }

    public void compile(String[] args) throws Exception {
        /*ARGS_ERRORS argumentsErrors = getArgumentValidationErrors(args);
        if (argumentsErrors != ARGS_ERRORS.NONE) {
            String errorMessage = argumentsErrors.getMessage();
            //LOGGER.error(errorMessage);
            System.out.println(errorMessage);
            return;
        }*/
        //File salFile = new File(args[0]);
        //String fileAbsolutePath = salFile.getAbsolutePath();
        Global global = new Parser().getGlobal("C:/TestSAL/out/artifacts/sal_jar/example.sal");
        saveBytecodeToClassFile(global);
    }

    private ARGS_ERRORS getArgumentValidationErrors(String[] args) {
        if (args.length != 1) {
            return ARGS_ERRORS.NO_FILE;
        }
        String filePath = args[0];
        if (!filePath.endsWith(".sal")) {
            return ARGS_ERRORS.BAD_FILE_EXTENSION;
        }
        return ARGS_ERRORS.NONE;
    }

    private void saveBytecodeToClassFile(Global global) throws IOException {
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator();
        byte[] bytecode = bytecodeGenerator.generate(global);
        String className = "example";
        String fileName = className + ".class";
        OutputStream os = new FileOutputStream(fileName);
        IOUtils.write(bytecode, os);
    }
}
