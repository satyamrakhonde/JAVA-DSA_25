package Arrays;

import java.util.Arrays;

public class FindMaxAndMin {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 3 };

        int max = 0;
        int min = 0;

        Arrays.sort(arr);

        min = arr[0];
        max = arr[arr.length - 1];

        System.out.println(max);
        System.out.println(min);

        // 2nd Approach
        // int min = arr[0];
        // int max = arr[0];

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < min)
        // min = arr[i];

        // if (arr[i] > max)
        // max = arr[i];
        // }

        // System.out.println("Max: " + max);
        // System.out.println("Min: " + min);
    }
}
