
import java.util.Arrays;

class AnagramString {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("Strings are not Anagram");
        }

        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if (Arrays.equals(ar1, ar2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }
}
