package Arrays.Chatgpt_Questions.Day2;

import java.util.Arrays;

public class TwoPointerApproach {

    public static void main(String[] args) {

        // Move Zeros
        int[] zerosArr = { 0, 1, 0, 3, 12 };
        int n1 = zerosArr.length;
        int slow = 0; // position for next non-zero

        for (int fast = 0; fast < n1; fast++) {
            if (zerosArr[fast] != 0) {
                int temp = zerosArr[slow];
                zerosArr[slow] = zerosArr[fast];
                zerosArr[fast] = temp;
                slow++;
            }
        }

        System.out.println(Arrays.toString(zerosArr));

        int[] arr = { 1, 2, 4, 7, 11, 15 };
        int target = 15;
        int n = arr.length - 1;
        int l = 0, r = n;
        boolean found = false;

        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                found = true;
                break;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
            System.out.println("Pair sum exists? " + found);
        }

        // Merge two sorted array - already done
        // int[] arr1 = { 1, 3, 5 };
        // int[] arr2 = { 2, 4, 6 };
        // int n1 = arr1.length, n2 = arr2.length;
        // int[] merged = new int[n1 + n2];

        // int i = 0, j = 0, k = 0;

        // while (i < n1 && j < n2) {
        // if (arr1[i] <= arr2[j]) {
        // merged[k++] = arr1[i++];
        // } else {
        // merged[k++] = arr2[j++];
        // }
        // }

        // while (i < n1)
        // merged[k++] = arr1[i++];
        // while (j < n2)
        // merged[k++] = arr2[j++];

        // System.out.print("Merged toys: ");
        // for (int num : merged)
        // System.out.print(num + " ");

    }

}

// Key Patterns You Now Know
// Fast + Slow Pointer:
// Keep track of “where the next valid toy should go”
// Use for in-place modifications
// Left + Right Pointer:
// Start from both ends
// Use for sorted array searching, sum, or merging
// General Idea:
// Think “two kids walking together” instead of brute force → reduces steps
// Helps avoid nested loops (O(n²) → O(n))