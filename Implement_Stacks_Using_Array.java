/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement_stacks_using_array;

import java.util.ArrayList;

class StackArray {
    private ArrayList<Integer> stack;

    public StackArray() {
        stack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        throw new IndexOutOfBoundsException("Stack is empty");
    }

    public int peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        throw new IndexOutOfBoundsException("Stack is empty");
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
public class Implement_Stacks_Using_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackArray stack = new StackArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());  // 30
        System.out.println(stack.peek()); // 20
    }
    
}
}