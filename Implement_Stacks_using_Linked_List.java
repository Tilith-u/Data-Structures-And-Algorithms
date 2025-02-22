/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement_stacks_using_linked_list;

class StackLinkedList {
    private Node top;

    private class Node {
        int value;
        Node next;
    }

    public StackLinkedList() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top != null) {
            int value = top.value;
            top = top.next;
            return value;
        }
        throw new IllegalStateException("Stack is empty");
    }

    public int peek() {
        if (top != null) {
            return top.value;
        }
        throw new IllegalStateException("Stack is empty");
    }

    public boolean isEmpty() {
        return top == null;
    }
public class Implement_Stacks_using_Linked_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());  // 30
        System.out.println(stack.peek()); // 20
    }
    
}
}
