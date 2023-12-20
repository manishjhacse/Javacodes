import java.util.*;

public class linearSearch {
    public static int findIndex(int arr[], int index, int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, index + 1, target);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int index = findIndex(arr, 0, target);
        if (index == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index: " + index);
        }
        sc.close();

    }
}
