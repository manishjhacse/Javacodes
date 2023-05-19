public class middle {
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
    public int middle_Of_Linkedlist()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public void insertAtBeg(int newData)
    {
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
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
    public static void main(String[] args) {
        middle ll=new middle();
        ll.insertAtBeg(5);
        ll.insertAtBeg(6);
        ll.insertAtBeg(8);
        ll.insertAtBeg(9);
        ll.insertAtBeg(6);
        System.out.println("Linked list is:");
        ll.print_Nodes();
        ll.middle_Of_Linkedlist();
        int middle_element=ll.middle_Of_Linkedlist();
        System.out.print("Middle of data of linked list is: "+middle_element);
    }

}
