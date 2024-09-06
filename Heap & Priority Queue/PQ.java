import java.util.Collections;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.offer(2);
        minPQ.offer(5);
        minPQ.offer(1);
        minPQ.offer(8);
        minPQ.offer(3);
        System.out.println("Peek of min Priority Queue " + minPQ.peek());
        // max Priority Queue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.offer(2);
        maxPQ.offer(5);
        maxPQ.offer(1);
        maxPQ.offer(8);
        maxPQ.offer(3);
        System.out.println("Peek of max Priority Queue " + maxPQ.peek());
        System.out.println(maxPQ.contains(8));
        maxPQ.poll();
        System.out.println(maxPQ.contains(8));

    }

}
