
public class RemoveAllOccurrenceOfChar {
    public static void main(String[] args) {
        String s = "ababca";
        char ch = 'a';

        s.replace(String.valueOf(ch), "");

        // 2nd Approach
        // StringBuilder s1 = new StringBuilder(s);

        // for (int i = 0; i < s1.length(); i++) {
        // if (ch == s1.charAt(i)) {
        // s1.deleteCharAt(i);
        // }
        // }
        // System.out.println(s1.toString());

        String s3 = "abcbas";
        char c = 'c';
        s3.replace(String.valueOf(c), "");
        System.out.println(s3.toString());

    }

    // s = s.replace(String.valueOf(ch), "");
}
