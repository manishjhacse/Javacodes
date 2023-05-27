import java.util.*;;

public class operations{
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();   
        //push operation
        stack1.push(5);
        stack1.push(8);
        stack1.push(6);
        stack1.push(9);
        stack1.push(12);
        stack1.push(15);
    
        //peek operation
        System.out.println("The top most element of stack is "+stack1.peek());

        //pop operation
        stack1.pop();
        System.out.println("The top most element of stack after pop operation is "+stack1.peek());

        //search operation
        // it gives the positon of searched element from top and if the element is not present it returns -1
        System.out.println("The position of 5 in stack is "+stack1.search(5));

        //isempty
        System.out.println("Is the given stack empty? "+stack1.empty());
    }
}