import java.util.Arrays;

public class AssigQ1 {
    public static void sortArray(int arr[]){
        int x = -1, y = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }

            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int arr[] = { 3, 8, 6, 7, 5, 9, 10 };
        System.out.println("given array is: "+Arrays.toString(arr));
        sortArray(arr);
        System.out.println("sorted array is: " + Arrays.toString(arr));

    }
}
