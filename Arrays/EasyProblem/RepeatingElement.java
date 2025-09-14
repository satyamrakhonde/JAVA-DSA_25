package Arrays.EasyProblem;

import java.util.Arrays;

public class RepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 3, 4 };

        int n = arr.length;
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int element = -1;
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                element = i;
            }
        }
        System.out.println(element);

        // 2nd Approach
        Arrays.sort(arr);
        int found = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1])
                found = arr[i];
        }
        System.out.println(found);
    }
}
