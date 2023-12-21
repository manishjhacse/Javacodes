public class rotatedBinarySearch {
    public static int search(int arr[], int target, int s, int e) {
        if (s > e)
            return -1;
        int mid = s + (e - s) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[s] < arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return search(arr, target, s, mid - 1);
            } else {
                return search(arr, target, mid + 1, e);
            }
        }
        if (target >= arr[mid] && target <= arr[e])
            return search(arr, target, mid + 1, e);

        return search(arr, target, s, mid - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 0, 1, 3, 4 };
        int n = arr.length;
        int target = 3;
        int index = search(arr, target, 0, n - 1);
        if (target == -1) {
            System.out.println("Element is not present in the array.");
        } else {
            System.out.println("Element is present at index: " + index);
        }
    }
}
