
public class PalindromeString {

    public static void main(String[] args) {
        String palindrome = "Was it a car or a cat I saw?";

        char[] arr = palindrome.toCharArray();

        int l = 0;
        int r = arr.length - 1;
        boolean isPalindrome = true;

        if (!Character.isLetterOrDigit(arr[arr.length - 1])) {
            // System.out.println("true");
            r--;
            // System.out.println(r);
        }

        while (l < r) {
            if (arr[l] != arr[r]) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        System.out.println(isPalindrome);
    }
}

// 2nd Approach

// public class Solution {
// public boolean isPalindrome(String s) {
// StringBuilder newStr = new StringBuilder();
// for (char c : s.toCharArray()) {
// if (Character.isLetterOrDigit(c)) {
// newStr.append(Character.toLowerCase(c));
// }
// }
// return newStr.toString().equals(newStr.reverse().toString());
// }
// }
