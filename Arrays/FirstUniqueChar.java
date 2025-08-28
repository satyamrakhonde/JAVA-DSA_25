package Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static void main(String[] args) {
        String input = "satyamrakhonde";
        Map<Character, Integer> uniqueChar = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            uniqueChar.put(c, uniqueChar.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : uniqueChar.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey());
                break;
            }
        }

    }
}
