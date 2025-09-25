package Arrays.Chatgpt_Questions.Day1;

import java.util.Arrays;

public class FindMaxToy {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 7, 3 };

        // int largest = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (largest < arr[i])
        // largest = arr[i];
        // }
        // System.out.println("Largest Number is : " + largest);

        // // Reverser Logic
        // int[] ar = new int[5];
        // int j = 0;
        // for (int i = arr.length - 1; i >= 0; i--) {
        // ar[j++] = arr[i];
        // }
        // System.out.println(Arrays.toString(ar));

        // Rotate Array by k times
        // arr = [1,2,3,4,5] , k =2
        // output: [4,5,1,2,3]
        // int a[] = { 1, 2, 3, 4, 5 };
        // int k = 2;
        // int n = arr.length;
        // for (int i = 0; i <= k; i++) {
        // int first = a[0];
        // for (int j = 0; j < n - 1; j++) {
        // a[j] = a[j + 1];
        // }
        // a[n - 1] = first;
        // }

        // System.out.println(Arrays.toString(a));

        // Prefix Sum
        int a[] = { 2, 4, 6, 8 };
        int n = a.length;
        int[] prefix = new int[n];

        prefix[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        System.out.println(Arrays.toString(prefix));
    }
}
