package Arrays.Chatgpt_Questions.Day3.SlidingWindowProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//  Count of Distinct Elements in Every Window of Size K

// Input: arr = [1,2,1,3,4,2,3], k=4

// Output: [3,4,4,3].

public class DistinctCountOfElement {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
        int k = 4;
        int l = 0, r = 0, n = arr.length;
        HashMap<Integer, Integer> distinct = new HashMap<>();
        // int[] output =new int[n - k + 1];
        List<Integer> output = new ArrayList<>();

        while (r < n) {

            distinct.put(arr[r], distinct.getOrDefault(arr[r], 0) + 1);

            if (r - l + 1 == k) {
                output.add(distinct.size()); // As map stores only distinct key , we are adding it in arraylist

                distinct.put(arr[l], distinct.get(arr[l]) - 1); // reduce the frequency of l element
                if (distinct.get(arr[l]) == 0) {
                    distinct.remove(arr[l]); // remove the element if the frequency is 0
                }
                l++;

            }
            r++;
        }
        System.out.println(output);
    }
}