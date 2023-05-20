import java.util.ArrayList;
import java.util.List;

public class palindrome {
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
   public boolean isPalindrome()
   {
    Node temp=head;
    List<Integer> arr=new ArrayList<>();
    while(temp!=null)
    {
        arr.add(temp.data);
        temp=temp.next;
    }
    int lb=0,ub=arr.size()-1;
    while(lb<ub)
    {
        if(!arr.get(lb).equals(arr.get(ub)))
        {
            return false;
        }
        lb++;
        ub--;
    }
    return true;

   }
   
    public void print_Nodes()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public void insertAtEnd(int newData)
    {
        Node newNode=new Node(newData);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    public static void main(String[] args) {
        palindrome ll = new palindrome();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(2);
        ll.insertAtEnd(1);
        System.out.println("is palinderome: "+ll.isPalindrome());
              
    }
}
