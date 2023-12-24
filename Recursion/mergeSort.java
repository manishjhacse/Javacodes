import java.util.Arrays;

public class mergeSort {
    public static void merge(int arr[], int l, int mid, int u) {
        int n1 = mid - l + 1;
        int n2 = u - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] < R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }

    }

    public static void merge_sort(int arr[], int l, int u) {
        if (l < u) {
            int mid = l + (u - l) / 2;
            merge_sort(arr, l, mid);
            merge_sort(arr, mid + 1, u);
            merge(arr, l, mid, u);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 1, 12, 5, 4,-1,5,8};
        int n = arr.length;
        merge_sort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
