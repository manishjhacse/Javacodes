import java.util.*;

public class quickSort {
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; 
        int i = low - 1; 
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void quick_Sort(int arr[], int s, int e) {
        if (s >= e)
            return;
        int p = partition(arr, s, e);
        quick_Sort(arr, s, p - 1);
        quick_Sort(arr, p + 1, e);

    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 2, 9, 8 };
        int n = arr.length;
        quick_Sort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
