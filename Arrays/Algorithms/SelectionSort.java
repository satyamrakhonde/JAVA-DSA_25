package Arrays.Algorithms;

import java.util.Arrays;

/*
 * Selection sort is comparison- based sorting algorithm,It sorts an array by repeatedly 
 * selecting the smallest(or largest) element from the unsorted portion and swapping it
 * with the first unsorted element. This process continues until the entire array is sorted.
 * 
 * -> First we find the smallest element and swap it with the first element. This way we
 * get the smallest element at its correct position.
 * -> Then we find the smallest among remaining elements(or second smallest) and swap it 
 * with the second element.
 * -> We keep doing this until we get all elements moved to correct position.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the current position holds the minimum element
            int min_idx = i;

            // Iterate through the unsorted position
            // to find the actual minimum
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {

                    // Update min_idx if a smaller element is found
                    min_idx = j;
                }
            }

            // Move minimum element to its
            // correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
