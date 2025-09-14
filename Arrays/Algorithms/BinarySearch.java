package Arrays.Algorithms;

/*
 * Binary Search Algorithm
 * 
 * -> Divide the search space into two halves by finding the middle index "mid"
 * -> Compare the middle element of the search space with the key.
 * -> If the key is found at middle element, the process is terminated.
 * -> If the key is not found at middle element, choose which hald will be used as the next sesarch space.
 *      -> If the key is smaller than the middle element, then the left side is used for next search.
 *      -> If the key is larger than the middle element, then the right side is used for next search.
 * -> This process is continued until the key is found or the total search space is exhausted.
 * 
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int target = 10;

        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("ELement is not present in array");
        else
            System.out.println("Element is present at index  " + result);
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target , ignore left hald
            if (arr[mid] < target)
                low = mid + 1;

            else
                high = mid - 1;
        }
        // If we reach here , then element was not present
        return -1;
    }
}
