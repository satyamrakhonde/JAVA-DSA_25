package Arrays.Algorithms;

// - Sum of Pair Equal to Target
public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = { -3, -1, 0, 1, 2 };
        int target = -2;

        if (twoSum(arr, target)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];

            // Check if the sum matches the target
            if (sum == target)
                return true;

            else if (sum < target)
                left++; // Move left pointer to the right

            else
                right--; // Move right pointer to the left
        }
        return false;
    }
}
