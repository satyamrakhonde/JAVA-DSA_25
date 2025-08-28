package Arrays;

import java.util.HashMap;

public class FrequencyCountNumbers {

    public static void main(String[] args) {
        int[] arrays = { 2, 3, 5, 4, 5, 3, 4 };

        HashMap<Integer, Integer> freqCount = new HashMap<>();

        for (int array : arrays) {
            freqCount.put(array, freqCount.getOrDefault(array, 0) + 1);
        }

        System.out.println(freqCount);

        for (HashMap.Entry<Integer, Integer> entry : freqCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
