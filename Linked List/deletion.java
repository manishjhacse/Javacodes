public class deletion {
    Node head;
   static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void delete(int position)
    {
        if(head==null)
        {
            System.out.println("Linked list is empty.");
            return;
        }
        Node temp=head;
        if(position==0)
        {
            head=temp.next;
        }
        for(int i=0;i<position-1 && temp!=null;i++)
        {
            temp=temp.next;
        }
        if(temp==null || temp.next==null)
        {
            return;
        }
        temp.next=temp.next.next;
        return;
    }
    public void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
     public static  void main(String[] args) {
        deletion ll=new deletion();
        ll.head=new Node(2);
        ll.head.next=new Node(5);
        ll.head.next.next=new Node(9);
        ll.print();
        ll.delete(2);
        System.out.println("After deleting 2nd postion");
        ll.print();
     }
}
