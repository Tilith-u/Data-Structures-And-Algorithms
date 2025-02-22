/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement_fifo_queues_using_linked_li;

import java.util.LinkedList;
class QueueDeque {
    private LinkedList<Integer> deque;

    public QueueDeque() {
        deque = new LinkedList<>();
    }

    public void enqueue(int value) {
        deque.addLast(value);
    }

    public int dequeue() {
        if (!deque.isEmpty()) {
            return deque.removeFirst();
        }
        throw new IllegalStateException("Queue is empty");
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

public class Implement_FIFO_Queues_Using_Linked_Li {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueDeque queue = new QueueDeque();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); // 10
    }
    
}
}
