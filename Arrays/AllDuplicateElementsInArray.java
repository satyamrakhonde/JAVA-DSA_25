package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class AllDuplicateElementsInArray {

    public static void main(String[] args) {
        int[] arrays = { 4, 3, 2, 7, 8, 2, 3, 1 };

        HashMap<Integer, Integer> duplicate = new HashMap<>();

        for (int array : arrays) {
            duplicate.put(array, duplicate.getOrDefault(array, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : duplicate.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey());
            }
        }

        // Another way
        HashSet<Integer> duplicate1 = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int array : arrays) {
            if (!seen.add(array))
                duplicate1.add(array);
        }

        System.out.println(duplicate1);
    }

}