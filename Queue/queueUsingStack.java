import java.util.Stack;

public class queueUsingStack {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    void enQueue(int data) //Time complexity=O(1)
    {
        stack1.push(data);
    }
     int deQueue() //Time complexity=O(n);
    {
        int ele;
        if(stack1.empty() && stack2.empty())
        {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if(stack2.empty())
        {
            while(!stack1.empty())
            {
                ele=stack1.pop();
                stack2.push(ele);
            }
        }
        ele=stack2.pop();
        return ele;
    }
    public static void main(String[] args) {
        queueUsingStack q=new queueUsingStack(); 
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        
        System.out.println("Deleted element is "+q.deQueue());
        System.out.println("Deleted element is "+q.deQueue());
        System.out.println("Deleted element is "+q.deQueue());
        q.enQueue(5);
        q.enQueue(6);
        System.out.println("Deleted element is "+q.deQueue());
        System.out.println("Deleted element is "+q.deQueue());
        System.out.println("Deleted element is "+q.deQueue());
        System.out.println("Deleted element is "+q.deQueue());
    }
}
