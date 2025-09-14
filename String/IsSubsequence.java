public class IsSubsequence {

    public static void main(String[] args) {
        String s1 = "axy";
        String s2 = "adxcpy";

        int n = s1.length();
        int m = s2.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }
        System.out.println(i + " " + n);
        if (i == n)
            System.out.println("true");
    }
}
