package Arrays;

import java.util.Arrays;

public class FindMaxAndMin {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 3 };

        int max = 0;
        int min = 0;

        Arrays.sort(arr);

        // for (int i = 0; i < arr.length - 1; i++) {
        min = arr[0];
        max = arr[arr.length - 1];
        // }

        System.out.println(max);
        System.out.println(min);
    }
}
