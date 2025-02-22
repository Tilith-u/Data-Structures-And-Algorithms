/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement_steque.stack.queue._java_copy;
import java.util.LinkedList;

class Steque {
    private LinkedList<Integer> stack;

    public Steque() {
        stack = new LinkedList<>();
    }

    public void push(int value) {
        stack.addFirst(value);
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Steque is empty");
        }
        return stack.removeFirst();
    }

    public void enqueue(int value) {
        stack.addLast(value);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

public class Implement_StequeStackQueue_java_Copy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Steque steque = new Steque();
        steque.push(10);
        steque.push(20);
        steque.enqueue(30);
        System.out.println(steque.pop()); // 20
    }
    
}
}
