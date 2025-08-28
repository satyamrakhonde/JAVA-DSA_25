package Arrays;

public class SecondLargestInArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 77, 8, 9, 10 };

        int largest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}