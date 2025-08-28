import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();

        StringBuilder nonRepeated = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!seen.add(c)) {
                duplicate.add(c);
                // nonRepeated.append(c);
            }

        }

        System.out.println(duplicate); // gives -- [s,e,g,k]
        for (char item : duplicate) {
            nonRepeated.append(item);
        }
        System.out.println(nonRepeated); // gives a string "segk"

        // int[] arr = { 1, 1, 2, 2, 3 };

        // HashSet<Integer> seen = new HashSet<>();
        // HashSet<Integer> duplicate = new HashSet<>();

        // for (int a : arr) {
        // if (!seen.add(a))
        // duplicate.add(a);
        // }
        // System.out.println(duplicate);

        // Another Approach by HashMap

        // HashMap<Integer, Integer> duplicate = new HashMap<>();

        // for (int a : arr) {
        // duplicate.put(a, duplicate.getOrDefault(
        // a, 0) + 1);
        // }

        // for (HashMap.Entry<Integer, Integer> entry : duplicate.entrySet()) {
        // if (entry.getValue() == 2) {
        // System.out.println(entry.getKey());
        // }
        // }
    }
}