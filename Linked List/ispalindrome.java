import java.util.*;
public class ispalindrome {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    boolean ispalindrome()
    {
        Node slow=head;
        Node fast=head;
        Node prev,temp;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        prev=slow;
        slow=slow.next;
        prev.next=null;
        while(slow!=null)
        {
            temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }
        fast=head;
        slow=prev;
        while(slow!=null)
        {
            if(fast.data!=slow.data)
            {
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;

    }
    void insertAtEnd(int data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return;
        
    }
    void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
        return;
    }
    public static void main(String[] args) {
        ispalindrome ll=new ispalindrome();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.insertAtEnd(6);
        ll.insertAtEnd(5);
        ll.print();
        System.out.println("is palindrome: "+ll.ispalindrome());
    }
}
