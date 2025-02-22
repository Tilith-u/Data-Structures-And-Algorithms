/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement_stacks_using_deque;

import java.util.LinkedList;

class StackDeque {
    private LinkedList<Integer> deque;

    public StackDeque() {
        deque = new LinkedList<>();
    }

    public void push(int value) {
        deque.push(value);
    }

    public int pop() {
        if (!deque.isEmpty()) {
            return deque.pop();
        }
        throw new IllegalStateException("Stack is empty");
    }

    public int peek() {
        if (!deque.isEmpty()) {
            return deque.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
public class Implement_Stacks_Using_Deque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackDeque stack = new StackDeque();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());  // 30
        System.out.println(stack.peek()); // 20
    }
    
}
}
