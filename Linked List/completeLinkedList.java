public class completeLinkedList {
    Node head;
    Node tail;
    int size = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = head;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            head.next = null;
            tail = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void insertAtIndex(int data, int index) {
        if (index < 1 || index > size) {
            System.out.println("Invalid Index");
            return;
        }
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }
        if (index == size) {
            insertAtEnd(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        size--;
        return val;
    }

    public int deleteLast() {
        if (head == null) {
            System.out.println("LinkedList is already empty");
            return -1;
        }
        if (head.next == null) {
            return deleteFirst();
        }
        Node temp = getNode(size - 2);
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }

    public Node getNode(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Index out of bond");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteIndex(int index) {
        if (index == 0)
            return deleteFirst();
        if (index == size - 1)
            return deleteLast();
        Node prev = getNode(index - 1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node findNode(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return temp;
            }
            temp = temp.next;

        }
        return null;
    }

    public static void main(String[] args) {
        completeLinkedList list = new completeLinkedList();
        list.insertAtBeginning(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        list.print();
        list.insertAtEnd(9);
        list.insertAtEnd(10);
        list.insertAtEnd(11);
        list.print();
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.print();
        System.out.println(list.size);
        list.insertAtIndex(3, 2);
        list.print();
        System.out.println(list.size);
        list.insertAtIndex(12, 11);
        list.print();
        System.out.println(list.deleteFirst() + " deleted");
        list.print();
        System.out.println(list.deleteLast() + " deleted");
        list.print();
        System.out.println(list.deleteLast() + " deleted");
        list.print();
        System.out.println(list.deleteIndex(3) + " deleted");
        list.print();
        if (list.findNode(6) != null) {
            System.out.println("6 exists in LinkedList");
        } else {
            System.out.println("6 does not exist in LinkedList");
        }

    }
}
