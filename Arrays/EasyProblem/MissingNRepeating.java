package Arrays.EasyProblem;

import java.util.Arrays;
import java.util.HashMap;

public class MissingNRepeating {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        int[] a = new int[2];
        int count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                a[0] = arr[i];
            }

            if (arr[i] - arr[i - 1] == 2) {
                a[1] = arr[i - 1] + 1;
            }
        }

        System.out.println(Arrays.toString(a));

        // 2nd Approach - count frequency of each element and check if
        // element is coming twice means repeating
        // element having 0 frequency means missing
        int n = arr.length;
        int[] freq = new int[n + 1];
        int missing = -1;
        int repeating = -1;

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0)
                missing = i;
            else if (freq[i] == 2) {
                repeating = i;
            }
        }
        int[] missNRepeat = new int[2];
        missNRepeat[0] = repeating;
        missNRepeat[1] = missing;
        System.out.println(Arrays.toString(missNRepeat));
    }
}
