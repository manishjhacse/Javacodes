import java.util.ArrayList;

class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    // mean heap
    public void insert(T val) {
        list.add(val);
        upheap(list.size() - 1);

    }

    private void upheap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public T remove() {
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);
        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }
        if (min != index) {
            swap(index, min);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() {
        ArrayList<T> sortedList = new ArrayList<T>();
        while (!list.isEmpty()) {
            sortedList.add(this.remove());
        }
        return sortedList;
    }

}

public class HeapOperations {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<Integer>();
        heap.insert(7);
        heap.insert(8);
        heap.insert(9);
        heap.insert(10);
        heap.insert(11);
        heap.insert(12);
        heap.insert(14);
        heap.insert(13);
        heap.print();
        heap.insert(5);
        heap.print();
        heap.remove();
        heap.print();
        System.out.println(heap.heapSort());
    }
}
