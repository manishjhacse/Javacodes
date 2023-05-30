import java.util.*;
public class implementation{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<10;i++)
        {
            q.add(i);//enqueuen operation
        }
        System.out.println("Queue is: "+q);
        System.out.println("Size of queue is "+q.size());
        System.out.println("Top elememnt of queue is "+q.peek());
        q.remove();//dequeue operation
        System.out.println("After one dequeue operation:");
        System.out.println("Queue is: "+q);
        System.out.println("Size of queue is "+q.size());
        System.out.println("Top elememnt of queue is "+q.peek());
    }
}