/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement_fifo_queues_using_linked_list;

class QueueLinkedList {
    private Node front, rear;

    private class Node {
        int value;
        Node next;
    }

    public QueueLinkedList() {
        front = rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = front.value;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return front == null;
    }
public class Implement_FIFO_Queues_Using_Linked_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); // 10
    }
    
}
}