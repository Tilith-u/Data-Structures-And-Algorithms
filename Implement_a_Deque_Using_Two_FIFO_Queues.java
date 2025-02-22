/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implement_a_deque_using_two_fifo_queues;

import java.util.LinkedList;
import java.util.Queue;
        
class DequeUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public DequeUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Add to the front
    public void addFirst(int value) {
        queue1.add(value);
    }

    // Add to the rear
    public void addLast(int value) {
        queue2.add(value);
    }

    // Remove from the front
    public int removeFirst() {
        if (!queue1.isEmpty()) {
            return queue1.poll();
        }
        return -1; // Deque is empty
    }

    // Remove from the rear
    public int removeLast() {
        if (!queue2.isEmpty()) {
            return queue2.poll();
        }
        return -1; // Deque is empty
    }

    public boolean isEmpty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
public class Implement_a_Deque_Using_Two_FIFO_Queues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         DequeUsingQueues deque = new DequeUsingQueues();
        deque.addFirst(10);
        deque.addLast(20);
        System.out.println(deque.removeFirst()); // 10
        System.out.println(deque.removeLast());  // 20
    }
    
}
}