//Maximum Sum Subarray for given window_size

package Arrays;

public class MaximumSumSubArray {

    public static void main(String[] args) {
        int[] arr = { 3, 8, 2, 5, 7, 6, 12 };
        System.out.println(maxSum(arr));
    }

    static int maxSum(int[] arr) {
        int current = 0;
        int n = arr.length;
        int w = 4;
        for (int i = 0; i < w; i++) {
            current += arr[i];
        }
        int maxx = current;

        for (int i = 1; i <= n - w; i++) {
            current = current - arr[i] + arr[i + w - 1];
            if (current > maxx) {
                maxx = current;
            }
        }
        return maxx;
    }
}