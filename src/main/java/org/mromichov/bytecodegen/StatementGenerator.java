package org.mromichov.bytecodegen;

import org.mromichov.domain.expression.AlgorithmCall;
import org.mromichov.domain.expression.Expression;
import org.mromichov.domain.scope.LocalVariable;
import org.mromichov.domain.scope.Scope;
import org.mromichov.domain.statement.PrintStatement;
import org.mromichov.domain.statement.VariableDeclarationStatement;
import org.mromichov.domain.type.BuiltInType;
import org.mromichov.domain.type.ClassType;
import org.mromichov.domain.type.Type;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.*;

public class StatementGenerator {
    private MethodVisitor methodVisitor;
    private ExpressionGenerator expressionGenerator;
    private Scope scope;

    public StatementGenerator(MethodVisitor methodVisitor, Scope scope) {
        this.methodVisitor = methodVisitor;
        this.scope = scope;
        this.expressionGenerator = new ExpressionGenerator(methodVisitor,scope);
    }

    public void generate(PrintStatement printStatement) {
        Expression expression = printStatement.getExpression();
        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        expression.accept(expressionGenerator);
        Type type = expression.getType();
        String descriptor = "(" + type.getDescriptor() + ")V";
        ClassType owner = new ClassType("java.io.PrintStream");
        String fieldDescriptor = owner.getDescriptor();
        methodVisitor.visitMethodInsn(INVOKEVIRTUAL, fieldDescriptor, "println", descriptor, false);
    }

    public void generate(VariableDeclarationStatement variableDeclarationStatement) {
        Expression expression = variableDeclarationStatement.getExpression();
        String name = variableDeclarationStatement.getName();
        int index = scope.getLocalVariableIndex(name);
        Type type = expression.getType();
        expression.accept(expressionGenerator);
        if (type == BuiltInType.INT) {
            methodVisitor.visitVarInsn(ISTORE, index);
        } else {
            methodVisitor.visitVarInsn(ASTORE, index);
        }
        scope.addLocalVariable(new LocalVariable(name, expression.getType()));
    }

    public void generate(AlgorithmCall algorithmCall) {
        algorithmCall.accept(expressionGenerator);
    }
}
