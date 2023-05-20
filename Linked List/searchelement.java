public class searchelement {
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
    public boolean search(int x)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==x)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
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
        searchelement ll = new searchelement();
        ll.insertAtEnd(14);
        ll.insertAtEnd(21);
        ll.insertAtEnd(11);
        ll.insertAtEnd(30);
        ll.insertAtEnd(10);
        ll.print_Nodes();
        System.out.println("is 14 present: "+ll.search(14));
        System.out.println("is 13 present: "+ll.search(13));
    }
}
