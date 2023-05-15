class insertionAtEnd {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // insert the node at the very end in the linked list
    public void insertAtEnd(int newData){
        // intialize the newNode with the newData entered by the user
        Node newNode = new Node(newData);

        // LinkedList is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // LinkedList is not empty
        newNode.next = null;
        // traversing the linkedlist at the end of the node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;

        }
    }

    public static void main(String[] args) {
        insertionAtEnd llist = new insertionAtEnd();

        // function calling
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        llist.insertAtEnd(10);
        llist.insertAtEnd(15);

        System.out.println("Linked List after successful insertion of all the nodes:");
        llist.printNodes();
        System.out.println();


    }
}
