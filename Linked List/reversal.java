public class reversal {
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
    
    
    public void reverse()
    {
        Node current=head;
        Node prev=null;
        Node nextptr=null;
        while(current!=null)
        {
            nextptr=current.next;
            current.next=prev;
            prev=current;
            current=nextptr;
        }
        head=prev;
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
        reversal ll=new reversal();
        ll.InsertAtBeg(5);
        ll.InsertAtBeg(2);
        ll.InsertAtBeg(8);
        ll.InsertAtBeg(12);
        ll.InsertAtBeg(16);
        ll.print_Node();
        System.out.println("After reversing the Linked list: ");
        ll.reverse();
        ll.print_Node();
    }
    
}
