package org.mromichov.bytecodegen;

import org.apache.commons.lang3.StringUtils;
import org.mromichov.domain.expression.*;
import org.mromichov.domain.math.*;
import org.mromichov.domain.scope.LocalVariable;
import org.mromichov.domain.scope.Scope;
import org.mromichov.domain.type.BuiltInType;
import org.mromichov.domain.type.ClassType;
import org.mromichov.domain.type.Type;
import org.mromichov.exception.CalledAlgorithmDoesNotExistException;
import org.mromichov.util.DescriptorFactory;
import org.mromichov.visitor.AlgorithmVisitor;
import org.objectweb.asm.MethodVisitor;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Optional;

import static org.objectweb.asm.Opcodes.*;

public class ExpressionGenerator {
    private MethodVisitor methodVisitor;
    private Scope scope;

    public ExpressionGenerator(MethodVisitor methodVisitor, Scope scope) {
        this.methodVisitor = methodVisitor;
        this.scope = scope;
    }

    public void generate(VarReference varReference) {
        String varName = varReference.getVarName();
        int index = scope.getLocalVariableIndex(varName);
        LocalVariable localVariable = scope.getLocalVariable(varName);
        Type type = localVariable.getType();
        if (type == BuiltInType.INT) {
            methodVisitor.visitVarInsn(ILOAD, index);
        } else {
            methodVisitor.visitVarInsn(ALOAD, index);
        }
    }

    public void generate(Parameter parameter) {
        Type type = parameter.getType();
        int index = scope.getLocalVariableIndex(parameter.getName());
        if (type == BuiltInType.INT) {
            methodVisitor.visitVarInsn(ILOAD, index);
        } else {
            methodVisitor.visitVarInsn(ALOAD, index);
        }
    }

    public void generate(Value value) {
        Type type = value.getType();
        String stringValue = value.getValue();
        if (type == BuiltInType.INT) {
            int intValue = Integer.parseInt(stringValue);
            if (intValue >= -1 && intValue <= 5) methodVisitor.visitInsn(3 + intValue); // iconst_m1 = 2 ... iconst_5 = 8 ==> 3 + значение
            else if (intValue >= Byte.MIN_VALUE && intValue <= Byte.MAX_VALUE) methodVisitor.visitIntInsn(BIPUSH, intValue);
            else if (intValue >= Short.MIN_VALUE && intValue <= Short.MAX_VALUE) methodVisitor.visitIntInsn(SIPUSH, intValue);
            else methodVisitor.visitLdcInsn(intValue);
        } else if (type == BuiltInType.STRING) {
            stringValue = StringUtils.removeStart(stringValue, "\"");
            stringValue = StringUtils.removeEnd(stringValue, "\"");
            methodVisitor.visitLdcInsn(stringValue);
        }
    }

    public void generate(AlgorithmCall algorithmCall) {
        Collection<Expression> parameters = algorithmCall.getParameters();
        parameters.forEach(param -> param.accept(this));
        Type owner = algorithmCall.getOwner().orElse(new ClassType("example"));
        String methodDescriptor = getAlgorithmDescriptor(algorithmCall);
        String ownerDescriptor = owner.getInternalName();
        String algorithmName = algorithmCall.getAlgorithmName();
        methodVisitor.visitMethodInsn(INVOKESTATIC, ownerDescriptor, algorithmName, methodDescriptor, false);
    }

    public void generate(Addition expression) {
        evaluateArithmeticComponents(expression);
        methodVisitor.visitInsn(IADD);
    }

    public void generate(Subtraction expression) {
        evaluateArithmeticComponents(expression);
        methodVisitor.visitInsn(ISUB);
    }

    public void generate(Multiplication expression) {
        evaluateArithmeticComponents(expression);
        methodVisitor.visitInsn(IMUL);
    }

    public void generate(Division expression) {
        evaluateArithmeticComponents(expression);
        methodVisitor.visitInsn(IDIV);
    }

    private void evaluateArithmeticComponents(ArithmeticExpression expression) {
        Expression leftExpression = expression.getLeftExpression();
        Expression rightExpression = expression.getRightExpression();
        leftExpression.accept(this);
        rightExpression.accept(this);
    }

    private String getAlgorithmDescriptor(AlgorithmCall algorithmCall) {
        return Optional.of(getDescriptorForFunctionInScope(algorithmCall))
                .orElse(getDescriptorForFunctionOnClasspath(algorithmCall))
                .orElseThrow(() -> new CalledAlgorithmDoesNotExistException(algorithmCall));
    }


    private Optional<String> getDescriptorForFunctionInScope(AlgorithmCall algorithmCall) {
        return Optional.ofNullable(DescriptorFactory.getMethodDescriptor(algorithmCall.getSignature()));//TODO check errors here (not found function etc)
    }

    private Optional<String> getDescriptorForFunctionOnClasspath(AlgorithmCall algorithmCall) {
        try {
            String functionName = algorithmCall.getAlgorithmName();
            Collection<Expression> parameters = algorithmCall.getParameters();
            Optional<Type> owner = algorithmCall.getOwner();
            String className = owner.isPresent() ? owner.get().getName() : "example";
            Class<?> aClass = Class.forName(className);
            Method method = aClass.getMethod(functionName);
            String methodDescriptor = org.objectweb.asm.Type.getMethodDescriptor(method);
            return Optional.of(methodDescriptor);
        } catch (ReflectiveOperationException e) {
            return Optional.empty();
        }
    }
}
