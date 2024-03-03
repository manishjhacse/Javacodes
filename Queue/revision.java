import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class revision {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        queue.add(16);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.element()); // same as peek but it throws an exception if this queue is empty.

        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(15);
        deque.add(12);
        deque.addFirst(2);
        deque.addLast(5);
        deque.addFirst(1);
        System.out.println(deque.pop());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

    }
}
