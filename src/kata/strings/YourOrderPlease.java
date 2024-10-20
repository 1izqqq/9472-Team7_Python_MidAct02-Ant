package kata.strings;

public class YourOrderPlease {
    public static String order(String words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        String[] wordsArray = words.split(" ");
        String[] orderedArray = new String[wordsArray.length];

        for (String word : wordsArray) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    orderedArray[c - '1'] = word;
                    break;
                }
            }
        }
        return String.join(" ", orderedArray);
    }
}
