import java.util.Arrays;

public class AssigQ2 {
    public static void partition(int arr[], int l, int r) {
        int pivot = 0;
        int pIndex = 0;
        for (int i = l; i <= r; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 19, -20, 7, -4, -13, 11, -5, 3 };
        int n = arr.length - 1;
        System.out.println("given array is " + Arrays.toString(arr));
        partition(arr, 0, n);
        System.out.println("Array after parition is " + Arrays.toString(arr));
    }
}
