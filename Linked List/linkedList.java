public class linkedList {
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
    public void insertAtBeg(int newData)
    {
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int newData)
    {
        Node newNode=new Node(newData);
        if(head==null)
        {
            newNode.next=head;
            head=new Node(newData);
            return;
        }
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    
    public void insertAfterNode(Node prev_node,int newData)
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
    public void print_nodes()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.insertAtBeg(5);
        ll.print_nodes();
        ll.insertAtBeg(2);
        ll.print_nodes();
        ll.insertAtEnd(3);
        ll.print_nodes();
        ll.insertAfterNode(ll.head.next, 15);
        ll.print_nodes();
    }

}
