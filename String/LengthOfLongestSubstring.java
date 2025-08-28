import java.util.Arrays;

public class LengthOfLongestSubstring {

    // Function to find the length of the longest
    // substring without repeating characters
    static int lengthOfLongestSubstring(String s) {

        // Array to store the last index
        // where each character occurred
        int[] hash = new int[256];

        // Initialize all elements
        // of the array to -1
        Arrays.fill(hash, -1);

        // Get the length of
        // the input string
        int n = s.length();

        // Pointers to keep track
        // of the current substring
        int l = 0, r = 0;

        // Variable to store the maximum
        // length of substring without
        // repeating characters
        int maxLen = 0;

        // Loop until the right pointer
        // reaches the end of the string
        while (r < n) {
            // If the current character
            // has been seen before
            if (hash[s.charAt(r)] != -1) {
                // If its last occurrence is
                // within the current substring
                if (hash[s.charAt(r)] >= l) {
                    // Move the left pointer to the
                    // position after the last occurrence
                    // of the current character
                    l = hash[s.charAt(r)] + 1;
                }
            }

            // Calculate the length
            // of the current substring
            int len = r - l + 1;

            // Update the maximum
            // length if needed
            maxLen = Math.max(len, maxLen);

            // Update the last occurrence
            // index of the current character
            hash[s.charAt(r)] = r;

            // Move the right pointer
            // to the next position
            r++;
        }
        // Return the maximum length of
        // substring without repeating characters
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcb";
        System.out.println("Input String: " + s);
        System.out.println(
                "Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}