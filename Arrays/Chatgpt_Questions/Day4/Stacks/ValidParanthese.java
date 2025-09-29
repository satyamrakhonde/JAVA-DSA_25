package Arrays.Chatgpt_Questions.Day4.Stacks;

import java.util.Stack;

// Input: s = "({[]})"
// Output: true

// Input: s = "([)]"
// Output: false

public class ValidParanthese {
    public static void main(String[] args) {
        String s1 = "({[]})";
        String s2 = "{)}";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // push opening bracket
            } else {
                if (stack.isEmpty())
                    return false; // no opening to match

                char top = stack.pop(); // get last opening
                // check if matches
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false; // mismatch
                }
            }
        }

        return stack.isEmpty(); // all matched?
    }
}
