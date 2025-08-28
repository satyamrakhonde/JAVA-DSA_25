//Maximum Subarray Sum - Kadane's Algorithm - output 11

package Arrays;

public class MaxSumSubarray {

    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println(maxSubarraySum(arr));
    }

    private static int maxSubarraySum(int[] arr) {

        int res = arr[0]; // Stores the result (Maximum sum so far)

        int maxEnding = arr[0]; // Maximum Sum oF subArray ending at current position

        for (int i = 0; i < arr.length; i++) {

            maxEnding = Math.max(maxEnding + arr[i], arr[i]); // Either extend the previous subarray or start
            // new from current element

            res = Math.max(res, maxEnding); // Update result if the new subarray sum is larger
        }
        return res;
    }
}