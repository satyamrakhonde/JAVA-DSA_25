package Arrays.Chatgpt_Questions.Day4.Stacks;

import java.util.Stack;

// You are given a string s. You need to repeatedly remove adjacent duplicates until no more can be removed.
// Input: "abbaca"
// Step 1 → "a[bb]aca" → "aaca"
// Step 2 → "aa[ca]" → "ca"
// Output: "ca"

public class RemoveAllAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
