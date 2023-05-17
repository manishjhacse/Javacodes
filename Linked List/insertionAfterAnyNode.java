public class insertionAfterAnyNode {
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
    public void InsertAtBeg(int newData)
    {
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtAnyNode(Node prev_node,int newData)
    {
        if(prev_node==null)
        {
            System.out.println("Previous node can not be null.");
            return;
        }
        Node newNode=new Node(newData);
        newNode.next=prev_node.next;
        prev_node.next=newNode;     
    }
    public static void main(String[] args) {
        insertionAfterAnyNode ll=new insertionAfterAnyNode();
        ll.InsertAtBeg(5);
        ll.print_Nodes();
        ll.insertAtAnyNode(ll.head, 7);
        ll.print_Nodes();
        ll.insertAtAnyNode(ll.head, 8);
        ll.print_Nodes();
        ll.insertAtAnyNode(ll.head.next.next, 11);
        ll.print_Nodes();
        ll.insertAtAnyNode(ll.head, 0);
        ll.print_Nodes();
    }
}
