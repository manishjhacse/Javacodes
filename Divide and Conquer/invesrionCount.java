import java.lang.reflect.Array;
import java.util.Arrays;

public class invesrionCount {
    public static int merge(int arr[], int l, int mid, int h) {
        int swap = 0;
        int lSubarray[] = Arrays.copyOfRange(arr, l, mid + 1);// l included mid+1 excluded
        int rSubarray[] = Arrays.copyOfRange(arr, mid + 1, h + 1);// mid+1 included h excluded
        int i = 0, j = 0, k = l;
        while (i < lSubarray.length && j < rSubarray.length) {
            if (lSubarray[i] <= rSubarray[j]) {
                arr[k++] = lSubarray[i++];
            } else {
                arr[k++] = rSubarray[j++];
                swap += (mid + 1) - (l + i);
            }
        }
        while (i < lSubarray.length) {
            arr[k++] = lSubarray[i++];
        }
        while (j < rSubarray.length) {
            arr[k++] = rSubarray[j++];
        }
        return swap;
    }

    public static int invesrion_count(int arr[], int l, int h) {
        int count = 0;
        if (l < h) {
            int mid = l + (h - l) / 2;
            count += invesrion_count(arr, l, mid);
            count += invesrion_count(arr, mid + 1, h);
            count += merge(arr, l, mid, h);
        }
        return count;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 8, 3, 4 };
        int size = arr.length - 1;
        int result = invesrion_count(arr, 0, size);
        System.out.println(result);
    }
}
