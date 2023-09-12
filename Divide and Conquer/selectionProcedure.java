public class selectionProcedure {
    public static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static int selection_procedure(int arr[], int l, int h, int k) {
        int m = partition(arr, l, h);
        if (m + 1 == k) {
            return arr[m];
        } else if (m + 1 < k) {
            return selection_procedure(arr, m + 1, h, k);
        } else {
            return selection_procedure(arr, l, m - 1, k);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 50, 30, 70, 90, 10, 34, 89, 98, 13 };
        int n = arr.length - 1;
        int k = 5;
        if (k > arr.length) {
            System.out.println("Invalid value of k");
        } else {

            System.out.println(k + "th smallest element in Array is " + selection_procedure(arr, 0, n, k));
        }
    }
}
