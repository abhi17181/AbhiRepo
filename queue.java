import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // Enqueue (add elements)
        q.add(30);
        q.add(70);
        q.add(80);
        q.add(50);

        System.out.println("Initial Queue: " + q);

        // Dequeue (remove elements from front)
        q.remove(); // removes 30
        q.remove(); // removes 70
        q.remove(); // removes 80

        System.out.println("Queue after 3 deletions: " + q);

        // Peek (front element)
        System.out.println("Front element: " + q.peek());
    }
}
