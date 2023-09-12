import java.util.*;

public class MergeSort {
    public static void merge(int arr[], int l, int mid, int r) {
        int i, j, k;
        int n1 = mid - l + 1; // size of left subarray
        int n2 = r - (mid + 1) + 1; // size of right subarray
        int l_subarr[] = new int[n1];
        int r_subarr[] = new int[n2];
        for (i = 0; i < n1; i++) {
            l_subarr[i] = arr[i + l];
        }
        for (j = 0; j < n2; j++) {
            r_subarr[j] = arr[mid + 1 + j];
        }
        i = j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (l_subarr[i] <= r_subarr[j]) {
                arr[k] = l_subarr[i];
                i++;
            } else {
                arr[k] = r_subarr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = l_subarr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = r_subarr[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int i, int j) {
        if (i < j) {
            int mid = i + (j - i) / 2;
            mergeSort(arr, i, mid);//left subarray
            mergeSort(arr, mid + 1, j);//right subarray
            merge(arr, i, mid, j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting is:");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, n - 1);
        System.out.println("Array after sorting is:");
        System.out.println(Arrays.toString(arr));
        sc.close(); 
    }
}
