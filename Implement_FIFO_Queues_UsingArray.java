/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement_fifo_queues_using.array;

class QueueArray {
    private int front, rear, size;
    private int[] queue;

    public QueueArray(int capacity) {
        queue = new int[capacity];
        front = rear = size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

public class Implement_FIFO_Queues_UsingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         QueueArray queue = new QueueArray(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); // 10
    }
    
}
}