import java.util.*;
public class dequeFuctions {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();
        d.addFirst(5);
        d.addFirst(6);
        d.addFirst(7);
        System.out.println("After performing addfirst() operation"+d);
        d.addLast(8);
        d.addLast(9);
        System.out.println("After performing addlast() operation"+d);
        System.out.println("size of deque is "+d.size());
        d.removeFirst();
        System.out.println("After performing removefirst() operation"+d);
        d.removeLast();
        System.out.println("After performing removelast() operation"+d);
        System.out.println("First element is "+d.getFirst());
        System.out.println("Last element is "+d.getLast());
        System.out.println("size of deque is "+d.size());

    }
}
