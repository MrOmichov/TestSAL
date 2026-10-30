package org.mromichov;

import org.mromichov.bytecodegen.BytecodeGenerator;
import org.mromichov.parsing.SyntaxTreeTraverser;
import org.mromichov.parsing.domain.Algorithm;

import java.io.*;
import java.util.List;

public class Compiler {

    public static void main(String[] args) throws IOException {
        new Compiler().compile(args);
    }

    private void compile(String[] args) throws IOException {
        final ARGS_ERRORS argsErrors = getArgsError(args);

        // Если есть ошибка
        if (argsErrors != ARGS_ERRORS.NONE) {
            System.out.println(argsErrors.getMessage());
            return;
        }

        final File salFile = new File(args[0]);
        final String fileName = salFile.getName();
        final String fileAbsPath = salFile.getAbsolutePath();
        final String className = fileName.substring(0,fileName.length() - 4); // Название класса
        final List<Algorithm> algorithms = new SyntaxTreeTraverser(className).getAlgorithms(fileAbsPath);
        final byte[] bytecode = new BytecodeGenerator().generateBytecode(algorithms, className);
        saveBytecodeToClassFile(fileName, bytecode);
    }

    private ARGS_ERRORS getArgsError(String[] args) {
            if (args.length != 1) return ARGS_ERRORS.NO_FILE; // Если не указан файл в аргументах
            final String filePath = args[0];
            if (!filePath.endsWith(".sal")) return ARGS_ERRORS.BAD_FILE_EXTENSION;
            else return ARGS_ERRORS.NONE;
    }

    private static void saveBytecodeToClassFile(String fileName, byte[] bytecode) throws IOException {
        System.out.println("Saving bytecode to the file");
        final String classFileName = fileName.substring(0, fileName.length() - 3) + "class"; // .class файл с тем же названием
        try {
            OutputStream os = new FileOutputStream(classFileName);
            os.write(bytecode);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Compilation is complete");
    }
}
