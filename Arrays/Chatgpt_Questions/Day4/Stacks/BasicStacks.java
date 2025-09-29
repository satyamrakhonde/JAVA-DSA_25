package Arrays.Chatgpt_Questions.Day4.Stacks;

import java.util.Stack;

public class BasicStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println(stack.peek()); // top element

        System.out.println(stack.pop()); // remove element

        System.out.println(stack);

        System.out.println("Is empty ?  " + stack.isEmpty());
    }
}
