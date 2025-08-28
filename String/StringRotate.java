//Input s1 = "abcd" , s2 = "cdab"
//Output : true

//Input s1 = "aab", s2 = "aba"
//Output: true
public class StringRotate {

    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";

        System.out.println(areRotations(s1, s2));
    }

    static boolean areRotations(String s1, String s2) {
        int n = s1.length();

        for (int i = 0; i < n; i++) {

            if (s1.equals(s2)) {
                return true;
            }

            char last = s1.charAt(s1.length() - 1);
            s1 = last + s1.substring(0, s1.length() - 1);
        }

        return false;

    }

}
