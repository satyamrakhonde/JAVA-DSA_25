package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

//Distinct Element in an Array. PRint Unique elements
//arr [] = {12, 10, 9, 45, 2, 10, 10, 45}
//Output = {12, 10, 9, 45, 2};
// ArrayList<Integer> un = new ArrayList<>(Arrays.asList(1, 2, 3));
public class DisntinctElement {

    public static void main(String[] args) {
        int[] arr = { 12, 10, 9, 45, 2, 10, 10, 45 };
        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = true;
                    break;
                }
            }

            if (!isUnique) {
                unique.add(arr[i]);
            }
        }
        System.out.println(unique.toString());

        // Another way from HashSet
        HashSet<Integer> unique1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            unique1.add(arr[i]);
        }
        System.out.println(unique1);
    }

}
