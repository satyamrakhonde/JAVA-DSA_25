package Arrays.Chatgpt_Questions.Day3.SlidingWindowProblems;

import java.util.Arrays;

public class SlidingWindow {

    public static void main(String[] args) {

        // Maximum Sum SubArray
        // int[] arr = { 2, 1, 5, 1, 3, 2 };
        // int k = 3; // window size
        // int n = arr.length;
        // int windowSum = 0, maxSum = Integer.MIN_VALUE, l = 0, r = 0;
        // while (r < n) {

        // windowSum = windowSum + arr[r];

        // if (r - l + 1 == k) {
        // maxSum = Math.max(maxSum, windowSum);
        // windowSum = windowSum - arr[l];
        // l++;
        // }
        // r++;
        // }
        // System.out.println("Maximum Sum : " + maxSum);

        // // Minimum Sum SubArray of Size k
        // int[] input = { 4, 2, 1, 7, 8, 1, 2, 8, 1, 0 };
        // int k1 = 3;
        // int n1 = input.length;
        // int l1 = 0, r1 = 0, minSum = Integer.MAX_VALUE, windowSum1 = 0;

        // while (r1 < n1) {

        // windowSum1 = windowSum1 + input[r1];

        // if (r1 - l1 + 1 == k1) {
        // minSum = Math.min(minSum, windowSum1);
        // windowSum1 = windowSum1 - input[l1];
        // l1++;
        // }
        // r1++;
        // }
        // System.out.println("Minimum Sum : " + minSum);

        // // Average Of All SubArrays of Size k
        // int[] average = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
        // int k3 = 5;
        // int n3 = average.length;
        // int l3 = 0, r3 = 0, avg = 0, windowSum3 = 0;
        // double[] averageSum = new double[n3 - k3 + 1];

        // while (r3 < n3) {
        // windowSum3 = windowSum3 + average[r3];

        // if (r3 - l3 + 1 == k3) {
        // double windowAverage = (double) windowSum3 / k3;
        // averageSum[l3] = windowAverage;
        // windowSum3 = windowSum3 - average[l3];
        // l3++;
        // }
        // r3++;
        // }

        // System.out.println(Arrays.toString(averageSum));

        // Count SubArray of Size k with Sum >= Target
        // int[] arr = { 2, 1, 5, 2, 8 };
        // int n = arr.length;
        // int k = 3;
        // int target = 7;
        // int count = 0, sum = 0, l = 0, r = 0;

        // while (r < n) {
        // sum = sum + arr[r];

        // if (r - l + 1 == k) {
        // if (sum >= target) {
        // count++;
        // }
        // sum = sum - arr[l];
        // l++;
        // }
        // r++;
        // }
        // System.out.println("The number of subarrays with sum ≥ target = " + count);

        // Maximum of All SubArray of Size k
        // Input: arr = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
        // Output: [3, 3, 5, 5, 6, 7]
        // (Explanation: First window [1,3,-1] → max=3, next [3,-1,-3] → max=3, etc.)

        // int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7};
        // int n = arr.length;
        // int k = 3;
        // int target = 7;
        // int count = 0, sum = 0, l = 0, r = 0;
        // int[] output = new int[n - k + 1];
        // while(r < n) {

        // sum = sum + arr[r];

        // if(r + l -1== k) {
        // sum =sum - arr[l];
        // l++;
        // }
        // r++;
        // }

        // This above question is separately handled in MaxSubArrayDeque.java
    }

}
