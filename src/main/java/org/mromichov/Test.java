package org.mromichov;

import com.ibm.icu.text.Transliterator;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
//        String CYRILLIC_TO_LATIN = "Russian-Latin/BGN";
//        Transliterator toLatinTrans = Transliterator.getInstance(CYRILLIC_TO_LATIN);
//        String result = toLatinTrans.transliterate("Привет, мир!");
//        System.out.println(result);

        double a = new Scanner(System.in).nextDouble();
        if (a != 1.23) {
            System.out.println(a);
        }
    }
}
