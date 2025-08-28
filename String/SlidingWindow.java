import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SlidingWindow {

    // Longest substring without repeating characters
    // public int lengthOfLongestSubstring(String s) {
    // Set<Character> charSet = new HashSet<>();
    // int left = 0;
    // int maxLength = 0;

    // for (int right = 0; right < s.length(); right++) {
    // char currentChar = s.charAt(right);
    // while (charSet.contains(currentChar)) {
    // charSet.remove(s.charAt(left));
    // left++;
    // }
    // charSet.add(currentChar);
    // maxLength = Math.max(maxLength, right - left + 1);
    // }
    // return maxLength;
    // }

    // Example with HashMap for counting (useful for k distinct characters)
    // Longest substring with at most K distinct characters
    public int longestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> charCounts = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            charCounts.put(currentChar, charCounts.getOrDefault(currentChar, 0) + 1);

            // Shrink window if distinct characters exceed k
            while (charCounts.size() > k) {
                char charToRemove = s.charAt(left);
                charCounts.put(charToRemove, charCounts.get(charToRemove) - 1);
                if (charCounts.get(charToRemove) == 0) {
                    charCounts.remove(charToRemove);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        SlidingWindow solver = new SlidingWindow();
        // System.out.println(
        // "Longest substring without repeating chars 'abcabcbb': " +
        // solver.lengthOfLongestSubstring("abcabcbb")); // Output:
        // 3
        // (abc)
        // System.out.println(
        // "Longest substring without repeating chars 'bbbbb': " +
        // solver.lengthOfLongestSubstring("bbbbb")); // Output:
        // 1
        // (b)
        // System.out.println(
        // "Longest substring without repeating chars 'pwwkew': " +
        // solver.lengthOfLongestSubstring("pwwkew")); // Output:
        // 3
        // (wke)

        System.out.println("Longest substring with at most 2 distinct chars 'eceba': "
                + solver.longestSubstringKDistinct("eceba", 2)); // Output: 3 (ece)
        System.out.println("Longest substring with at most 1 distinct chars 'aaabbb': "
                + solver.longestSubstringKDistinct("aaabbb", 1)); // Output: 3 (aaa or bbb)
    }
}