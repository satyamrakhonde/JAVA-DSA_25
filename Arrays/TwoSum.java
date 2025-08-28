package Arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int target = 7;

        int[] arr = twoSumArray(nums, target);
        System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(twoSumArray(nums, target)));

    }

    static int[] twoSumArray(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}