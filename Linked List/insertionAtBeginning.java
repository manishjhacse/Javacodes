public class insertionAtBeginning {
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
    public void print_Node()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void InsertAtBeg(int newData)
    {
       Node newNode=new Node(newData);
       newNode.next=head;
       head=newNode;
    }
    public static void main(String[] args) {
        insertionAtBeginning ll=new insertionAtBeginning();
        ll.InsertAtBeg(5);
        ll.InsertAtBeg(2);
        ll.InsertAtBeg(8);
        ll.InsertAtBeg(45);
        ll.InsertAtBeg(20);
        ll.print_Node();
    }
    
}
