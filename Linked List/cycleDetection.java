public class cycleDetection {
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
    public void detect_Cycle()
    {
        Node slow=head;
        Node fast=head;
        int flag=0;
        while(slow!=null&&fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("No cycle is in the given linked list.");
        }
        else{
            System.out.println("cycle is present in the given linked list.");
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
    public static void main(String[] args) {
        cycleDetection ll= new cycleDetection();
        ll.insertAtBeg(5);
        ll.insertAtBeg(7);
        ll.insertAtBeg(9);
        ll.insertAtBeg(11);
        ll.insertAtBeg(13);
        ll.print_Nodes();
        ll.detect_Cycle();
        Node temp=ll.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=ll.head;
        System.out.println("After connecting last node to the head.......");
        ll.detect_Cycle();
    }
}
