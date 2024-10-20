package kata.math;

public class VowelCount {
    public static int getCount(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
