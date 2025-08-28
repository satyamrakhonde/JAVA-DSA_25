package StringList;

import java.util.HashMap;

public class MaxOccurString {

    public static void main(String[] args) {
        String sentence = "apple banana apple mango banana apple banana";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> max = new HashMap<>();
        for (String word : words) {
            max.put(word, max.getOrDefault(word, 0) + 1);
        }

        int maxCount = 0;
        String maxWord = "";
        for (HashMap.Entry<String, Integer> entry : max.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        System.out.println("THe maximum occurenced word is : " + maxWord);

        // Most Occurred Character

        String str = "abacabad";

        HashMap<Character, Integer> charfreq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charfreq.put(ch, charfreq.getOrDefault(ch, 0) + 1);
        }

        char maxChar = ' ';
        int maxCount1 = 0;
        for (HashMap.Entry<Character, Integer> entry : charfreq.entrySet()) {
            if (entry.getValue() > maxCount1) {
                maxCount1 = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("The maximum occurring character is : " + maxChar);
    }
}
