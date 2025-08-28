import java.util.Arrays;

public class ToUpperCase {
    public static void main(String[] args) {
        String sentence = "This is the sentence";

        // After space make the first character to upper case

        char[] arr = sentence.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                // i++;
                // System.out.println(i);
                arr[++i] = Character.toUpperCase(arr[i]);
            }
        }
        String str = new String(arr);
        System.out.println(str);
    }
}
