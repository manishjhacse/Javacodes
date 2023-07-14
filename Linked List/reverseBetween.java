public class reverseBetween {
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
    public void reverse(int l,int r)
    {
        Node start=head;
        Node current=head;
        Node nextnode=head;
        Node prev=head;
        Node temp=head;
        for(int i=1;i<l-1;i++)
        {
            start=start.next;
        }
        current=start.next;
        for(int i=0;i<r;i++)
        {
            prev=prev.next;
            temp=temp.next;
        }
        while(current!=temp)
        {
            nextnode=current.next;
            current.next=prev;
            prev=current;
            current=nextnode;
        }
        start.next=prev;

    }
    
    public void InsertAtBeg(int newData)
    {
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    public void print_Node()
    {
        Node tempNode=head;
        while(tempNode!=null)
        {
            System.out.print(tempNode.data+" ");
            tempNode=tempNode.next;
        }
        System.out.println();
    }
        public static void main(String[] args) {
        reverseBetween ll=new reverseBetween();
        ll.InsertAtBeg(5);
        ll.InsertAtBeg(2);
        ll.InsertAtBeg(8);
        ll.InsertAtBeg(12);
        ll.InsertAtBeg(16);
        ll.InsertAtBeg(56);
        ll.InsertAtBeg(100);
        ll.InsertAtBeg(52);
        ll.print_Node();
        System.out.println("After reversing the Linked list: ");
        ll.reverse(3,6);
        ll.print_Node();
    }
    
}
