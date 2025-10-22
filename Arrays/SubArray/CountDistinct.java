package Arrays.SubArray;

import java.util.ArrayList;
import java.util.HashMap;

//How many distinct(different) elements are ther in the fixed window
public class CountDistinct {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
        int k = 4;
        System.out.println(countDistinct(arr, k));
    }

    static ArrayList<Integer> countDistinct(int[] arr, int k) {

        int l = 0, r = 0, n = arr.length;
        HashMap<Integer, Integer> distinct = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();

        while (r < n) {

            distinct.put(arr[r], distinct.getOrDefault(arr[r], 0) + 1);

            if (r - l + 1 == k) {
                output.add(distinct.size());

                distinct.put(arr[l], distinct.get(arr[l]) - 1);

                if (distinct.get(arr[l]) == 0) {
                    distinct.remove(arr[l]);
                }
                l++;
            }
            r++;
        }
        return output;
    }
}
