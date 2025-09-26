// Maximum of All SubArray of Size k
// Input: arr = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
// Output: [3, 3, 5, 5, 6, 7]
// (Explanation: First window [1,3,-1] → max=3, next [3,-1,-3] → max=3, etc.)
package Arrays.Chatgpt_Questions.Day3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MaxSubArrayDeque {

    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int n = arr.length;
        int l = 0, r = 0;

        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        while (r < n) {

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[r]) {
                dq.pollLast();
            }

            dq.offerLast(r);

            if (dq.peekFirst() < 1) {
                dq.pollFirst();
            }

            if (r - l + 1 == k) {
                result.add(arr[dq.peekFirst()]);
                l++;
            }
            r++;
        }
        System.out.println(result);
    }

}

// This approach two pointer + sliding window
// But there is loop inside which is checking max element in subarray , making
// its time complexity
// Time: O(n·k) → for each of the n windows, we spend up to k time finding max.

// int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
// int k = 3;
// int n = arr.length;

// List<Integer> result = new ArrayList<>();
// int l = 0, r = 0;

// while (r < n) {
// // When we have a full window
// if (r - l + 1 == k) {
// // Find max in the window [l, r]
// int max = arr[l];
// for (int i = l; i <= r; i++) {
// max = Math.max(max, arr[i]);
// }
// result.add(max);

// // Slide window
// l++;
// }
// r++;
// }

// System.out.println(result);