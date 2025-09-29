package Arrays.Chatgpt_Questions.Day4.Stacks;

import java.util.Stack;

public class MinAddToMakeParantheseValid {
    public static void main(String[] args) {
        // String s = "(((";
        System.out.println(makeValidParanthese("((("));
        System.out.println(makeValidParanthese("(()"));
    }

    public static int makeValidParanthese(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.size();
    }
}
