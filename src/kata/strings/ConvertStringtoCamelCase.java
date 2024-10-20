package kata.strings;

import java.lang.StringBuilder;

public class ConvertStringtoCamelCase {
    public static String toCamelCase(String input){
        String standardizedInput = input.replaceAll("[-_]", " ");

        String[] words = standardizedInput.split("\\s+");
        if (words.length == 0) {
            return "";
        }

        StringBuilder camelCaseString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > 0) {
                if (i == 0) {
                    camelCaseString.append(word);
                } else {
                    camelCaseString.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1).toLowerCase());
                }
            }
        } return camelCaseString.toString();
    }
}
