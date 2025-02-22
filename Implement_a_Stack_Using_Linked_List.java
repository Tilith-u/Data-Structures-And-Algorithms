/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement_a_stack_using_linked_list;

class StackUsingLinkedList {
    private Node top;

    private class Node {
        int value;
        Node next;
    }

    public StackUsingLinkedList() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = top.value;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

public class Implement_a_Stack_Using_Linked_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // 20
    
}
}
}