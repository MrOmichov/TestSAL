package org.mromichov.util;

import com.ibm.icu.text.Transliterator;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public final class NameTransliteration {
    /*
    Сначала кириллица, потом латиница
     */
    private static final Map<String, String> alphabet = new HashMap<>();
    public NameTransliteration() {
        alphabet.put("а", "a");
        alphabet.put("б", "b");
        alphabet.put("в", "v");
        alphabet.put("г", "g");
        alphabet.put("д", "d");
        alphabet.put("е", "ye");
        alphabet.put("ё", "yo");
        alphabet.put("ж", "zh");
        alphabet.put("з", "z");
        alphabet.put("и", "i");
        alphabet.put("й", "y");
        alphabet.put("к", "k");
        alphabet.put("л", "l");
        alphabet.put("м", "m");
        alphabet.put("н", "n");
        alphabet.put("о", "o");
        alphabet.put("п", "p");
        alphabet.put("р", "r");
        alphabet.put("с", "c");
        alphabet.put("т", "t");
        alphabet.put("у", "u");
        alphabet.put("ф", "f");
        alphabet.put("х", "h");
        alphabet.put("ц", "ts");
        alphabet.put("ч", "ch");
        alphabet.put("ш", "sh");
        alphabet.put("щ", "sch");
        alphabet.put("ы", "y");
        alphabet.put("э", "e");
        alphabet.put("ю", "yu");
        alphabet.put("я", "ya");
    }
    public static String transliterate(String str) {
        /*str = str.toLowerCase();
        String[] keys = alphabet.keySet().toArray(String[]::new);
        String[] values = alphabet.values().toArray(String[]::new);
        str = StringUtils.replaceEach(str, keys, values);*/

        String CYRILLIC_TO_LATIN = "Russian-Latin/BGN";
        Transliterator toLatinTrans = Transliterator.getInstance(CYRILLIC_TO_LATIN);
        return toLatinTrans.transliterate(str);
    }
}
