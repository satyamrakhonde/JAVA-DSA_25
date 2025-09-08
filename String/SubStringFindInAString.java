//Check string s are the part of String t
//Also if check it in increasing

import java.util.Arrays;

public class SubStringFindInAString {
    public static void main(String[] args) {
        String s = "abc";
        String t = "akbdc";

        // String.sort(t);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);

        String t1 = new String(tArr);
        boolean isContain = t1.contains(s);
        System.out.println("String s is a part of String t : " + isContain);

    }
}
