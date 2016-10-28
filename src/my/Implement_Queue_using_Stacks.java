package my;

import java.util.Stack;

/**
 * Created by dean on 16/10/22.
 */
public class Implement_Queue_using_Stacks {
    Stack<Integer> stack = new Stack<>();
    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()){
            temp.push(stack.pop());
        }
        stack.push(x);
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()){
            temp.push(stack.pop());
        }
        temp.pop();
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

    // Get the front element.
    public int peek() {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()){
            temp.push(stack.pop());
        }
        int peek = temp.pop();
        stack.push(peek);
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return peek;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
