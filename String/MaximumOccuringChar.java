import java.util.HashMap;

public class MaximumOccuringChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        // HashMap<Character, Integer> maxOccur = new HashMap<>();
        // char maxChar = ' ';
        // int maxCount = 0;

        // for (char ch : s.toCharArray()) {
        // if (ch == ' ')
        // continue;
        // maxOccur.put(ch, maxOccur.getOrDefault(ch, 0) + 1);
        // if (maxOccur.get(ch) > maxCount) {
        // maxCount = maxOccur.get(ch);
        // maxChar = ch;
        // }
        // }

        char maxChar = ' ';
        int maxCount = 0;
        HashMap<Character, Integer> maxOccur = new HashMap<>();

        for (char ch : s.toCharArray()) {

            if (ch == ' ')
                continue;
            maxOccur.put(ch, maxOccur.getOrDefault(ch, 0) + 1);
            if (maxOccur.get(ch) > maxCount) {
                System.out.println(maxOccur.get(ch));
                maxCount = maxOccur.get(ch);
                maxChar = ch;
            }
        }
        System.out.println(maxChar);
        // for (HashMap.Entry<Character, Integer> entry : maxOccur.entrySet()) {
        // if (entry.getValue() > 3) {
        // System.out.println(entry.getValue());
        // }
        // }
    }
}