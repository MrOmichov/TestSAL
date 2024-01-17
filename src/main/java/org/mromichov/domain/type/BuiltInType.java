package org.mromichov.domain.type;

public enum BuiltInType implements Type {
    BOOLEAN("bool",boolean.class,"Z"),
    INT ("int", int.class,"I"),
    CHAR ("char", char.class,"C"),
    BYTE ("byte", byte.class,"B"),
    SHORT ("short", short.class,"S"),
    LONG ("long", long.class,"J"),
    FLOAT ("float", float.class,"F"),
    DOUBLE ("double", double.class,"D"),
    STRING ("string", String.class,"Ljava/lang/String;");

    private String name;
    private Class<?> typeClass;
    private String descriptor;


    BuiltInType(String name, Class<?> typeClass, String descriptor) {
        this.name=name;
        this.typeClass = typeClass;
        this.descriptor = descriptor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Class<?> getTypeClass() {
        return typeClass;
    }

    @Override
    public String getDescriptor() {
        return descriptor;
    }

    @Override
    public String getInternalName() {
        return getDescriptor();
    }
}
