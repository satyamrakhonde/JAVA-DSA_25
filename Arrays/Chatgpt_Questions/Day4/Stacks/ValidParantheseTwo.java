// You are given a string s containing only the characters '(', ')', '{', '}', '[', ']'.
// Task: Determine if the string is valid.
// Rules for a valid string:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.

package Arrays.Chatgpt_Questions.Day4.Stacks;

import java.util.Stack;

public class ValidParantheseTwo {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("(]"));
    }
}
