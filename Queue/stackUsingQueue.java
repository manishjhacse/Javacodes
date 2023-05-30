//  Time complexity=O(n)
// Space complexity=O(n)

import java.util.*;

public class stackUsingQueue {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    void push(int data){
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();//poll function is used to remove data and it returns null if queue is empty
        }
        q1.add(data);
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
    }
    int pop(){
        if(q1.isEmpty())
        {
            System.out.println("Stack is empty");
            System.exit(0);
        }
        return q1.poll();
    }
    public static void main(String[] args) {
        stackUsingQueue stack=new stackUsingQueue();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println("Deleted element is: "+stack.pop());
        System.out.println("Deleted element is: "+stack.pop());
        System.out.println("Deleted element is: "+stack.pop());
        stack.push(11);
        System.out.println("Deleted element is: "+stack.pop());
        System.out.println("Deleted element is: "+stack.pop());
        System.out.println("Deleted element is: "+stack.pop());
        System.out.println("Deleted element is: "+stack.pop());
    }
}
