//Products of Array Except Self
//Input: nums = [1,2,4,6]
// Output: [48,24,12,8]

// Input: nums = [-1,0,1,2,3]
// Output: [0,-6,0,0,0]

package Arrays.mediumLevelQuestions;

import java.util.Arrays;

public class ArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 6 };
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] new1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    product = product * nums[j];
                }
            }
            new1[i] = product;
        }
        return new1;
    }
}
