package org.mromichov;

import org.mromichov.parsing.domain.Variable;
import org.mromichov.type.Type;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            String fileName = "example.sal";
            final String classFileName = fileName.substring(0, fileName.length() - 3) + "class";
            System.out.println();

        }
        Map<String, Variable> memory = new HashMap<>();
        for (int i = 1; i < 6; ++i) {
            memory.put("_" + i, new Variable(i, Type.INT, String.valueOf(i)));
            System.out.println("_" + i);
            System.out.println(memory.get("_" + i).getType());
            System.out.println(memory.get("_" + i).getIndex());
            System.out.println(memory.get("_" + i).getValue());
            System.out.println();
        }

        Variable variable = memory.get("_" + 1);
        variable.setValue("12");

        for (int i = 1; i < 6; ++i) {
            System.out.println("_" + i);
            System.out.println(memory.get("_" + i).getType());
            System.out.println(memory.get("_" + i).getIndex());
            System.out.println(memory.get("_" + i).getValue());
            System.out.println();
        }
    }
}