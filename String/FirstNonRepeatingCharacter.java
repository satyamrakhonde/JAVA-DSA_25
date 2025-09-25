import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String word = "geeksforgeeks";

        HashMap<Character, Integer> firstnonRepChar = new LinkedHashMap<>();

        for (char arr : word.toCharArray()) {
            firstnonRepChar.put(arr, firstnonRepChar.getOrDefault(arr, 0) + 1);
        }

        for (HashMap.Entry<Character, Integer> entry : firstnonRepChar.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
