package Arrays.Chatgpt_Questions.Day3.SlidingWindowProblems;

// arr = [1, 3, 2, 5, 4, 6]
// k = 3
//Output - [2, 3, 3, 2]

// Windows:
// [1, 3, 2] → max = 3, min = 1 → difference = 2
// [3, 2, 5] → max = 5, min = 2 → difference = 3
// [2, 5, 4] → max = 5, min = 2 → difference = 3
// [5, 4, 6] → max = 6, min = 4 → difference = 2

import java.util.*;

public class MaxDiffSubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 4, 6 };
        int k = 3;
        int n = arr.length;

        Deque<Integer> maxDq = new ArrayDeque<>(); // stores indexes of max candidates
        Deque<Integer> minDq = new ArrayDeque<>(); // stores indexes of min candidates
        List<Integer> result = new ArrayList<>();

        int l = 0, r = 0;

        while (r < n) {
            // 1️⃣ Maintain decreasing deque for maximum
            while (!maxDq.isEmpty() && arr[maxDq.peekLast()] <= arr[r]) {
                maxDq.pollLast();
            }
            maxDq.offerLast(r);

            // 2️⃣ Maintain increasing deque for minimum
            while (!minDq.isEmpty() && arr[minDq.peekLast()] >= arr[r]) {
                minDq.pollLast();
            }
            minDq.offerLast(r);

            // 3️⃣ Remove elements outside current window
            // maxDq.peekFirst() < l

            // Look at the index of the tallest kid in the deque (front of deque).

            // If that index is smaller than l, it means he’s not standing in the current
            // window anymore.

            // ➝ Kick him out (pollFirst()).
            if (maxDq.peekFirst() < l) {
                maxDq.pollFirst();
            }
            if (minDq.peekFirst() < l) {
                minDq.pollFirst();
            }

            // 4️⃣ When window size == k → record result
            if (r - l + 1 == k) {
                int maxVal = arr[maxDq.peekFirst()];
                int minVal = arr[minDq.peekFirst()];
                result.add(maxVal - minVal);

                // shrink window
                l++;
            }

            r++;
        }

        System.out.println(result);
    }
}
