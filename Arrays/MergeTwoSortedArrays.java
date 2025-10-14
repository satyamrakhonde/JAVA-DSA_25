package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] ar1 = { 1, 3, 5, 7 };
        int[] ar2 = { 2, 4, 6, 8 };

        int[] ar3 = new int[ar1.length + ar2.length];

        int n1 = ar1.length;
        int n2 = ar2.length;
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (ar1[i] < ar2[j])
                ar3[k++] = ar1[i++];

            else
                ar3[k++] = ar2[j++];
        }

        while (i < n1)
            ar3[k++] = ar1[i++];

        while (j < n2)
            ar3[k++] = ar2[j++];

        // for (int m = 0; m < ar3.length; m++) {
        // System.out.println(ar3[m]);
        // }
        System.out.println(Arrays.toString(ar3));
    }
}
