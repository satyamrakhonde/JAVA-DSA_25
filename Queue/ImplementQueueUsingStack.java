package Queue;

import java.util.Stack;

public class ImplementQueueUsingStack {

    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    public int size() {
        return input.size() + output.size();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack st = new ImplementQueueUsingStack();

        st.push(10);
        st.push(20);

        st.push(30);

        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.empty());
        System.out.println(st.pop());
    }

}
