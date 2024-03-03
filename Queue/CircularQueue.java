class circular_Queue {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public circular_Queue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public circular_Queue(int length) {
        this.data = new int[length];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.err.println("The queue is full!");
            return false;
        }
        data[end++] = item;
        size++;
        end = end % data.length;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removed = data[front++];
        size--;
        front = front % data.length;
        return removed;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return data[front];
    }

    public int end() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return data[(end - 1 + data.length) % data.length];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i++] + "->");
            i = i % data.length;
        } while (i != end);
        System.out.println("END");
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        circular_Queue queue = new circular_Queue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        System.out.println(queue.remove() + " Removed from queue");
        queue.display();
        queue.insert(6);
        queue.display();
        queue.insert(7);
        queue.remove();
        queue.insert(7);
        queue.display();
        System.out.println(queue.front());
        System.out.println(queue.end());
    }
}
