public class reversalRecursion {
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
    
    public void reverse_Recursion(Node current,Node prev)
    {
        if(current.next==null)
        {
            head=current;
            current.next=prev;
            return;
        }
        Node nextptr=current.next;
        current.next=prev;
        reverse_Recursion(nextptr, current);
    }
    
    public void InsertAtBeg(int newData)
    {
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    public void print_Node()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
        public static void main(String[] args) {
        reversalRecursion ll=new reversalRecursion();
        ll.InsertAtBeg(5);
        ll.InsertAtBeg(2);
        ll.InsertAtBeg(8);
        ll.InsertAtBeg(12);
        ll.InsertAtBeg(16);
        ll.print_Node();
        System.out.println("After reversing the Linked list: ");
        ll.reverse_Recursion(ll.head,null);
        ll.print_Node();
    }
    
}
