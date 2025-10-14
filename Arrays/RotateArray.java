package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        // Brute Force Approach
        int n = arr.length; // [2, 3, 4, 5, 6, 1]
                            // [3, 4, 5, 6, 1, 2]

        for (int i = 0; i < k; i++) {
            int first = arr[0];

            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }

        System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < k; i++) {

        // int first = arr[0];
        // for (int j = 0; j < n - 1; j++) {
        // arr[j] = arr[j + 1];
        // }
        // arr[n - 1] = first;
        // System.out.println(Arrays.toString(arr));
        // }
    }
}
