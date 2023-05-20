public class insertNode {
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
    public void insert_Node(int pos,int d)
    {
        Node newNode=new Node(d);
        Node temp=head;
        for(int i=1;i<pos;i++)
        {
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
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
        insertNode ll = new insertNode();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.print_Nodes();
        ll.insert_Node(2, 3);
        ll.print_Nodes();
       
    }
}
