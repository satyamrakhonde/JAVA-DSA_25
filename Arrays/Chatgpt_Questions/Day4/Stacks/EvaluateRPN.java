//Evaluate Reverse Polish Notation
//["4","13","5","/","+"] = Expression: 4 + (13 / 5) = final answer 6 

//Approach is when a operator cames in stack ,pop two element and execute it and push it result in stack
//then again follow the same
package Arrays.Chatgpt_Questions.Day4.Stacks;

import java.util.Stack;

public class EvaluateRPN {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[] { "2", "1", "+", "3", "*" })); // 9
        System.out.println(evalRPN(new String[] { "4", "13", "5", "/", "+" })); // 6
        System.out.println(evalRPN(new String[] { "-7", "2", "/" })); // -3
        System.out
                .println(evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" })); // 22

    }

    private static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if ("+-*/".contains(token)) {
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;
                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
