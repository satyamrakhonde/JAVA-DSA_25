
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String sentence = "I love Java";
        String[] words = sentence.split("");
        // System.out.println(Arrays.toString(words));
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0)
                reversed.append(" ");
        }

        System.out.println(reversed.toString()); // Output: Java love I

    }
}
