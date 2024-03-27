
//print the first negative number of each subarray of size k
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class firstNegativeInKSize {
    public static List<Integer> firstNegativeList(int arr[], int k) {
        List<Integer> negativeList = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int start = 0, end = 0;
        while (end < arr.length) {
            if (arr[end] < 0) {
                negativeList.add(end);
            }
            if (end - start + 1 < k) {
                end++;
            } else if (end - start + 1 == k) {
                if (negativeList.isEmpty()) {
                    ans.add(0);
                } else {
                    int index = negativeList.get(0);
                    ans.add(arr[index]);
                }
                System.out.println("first negative number between " + arr[start] + " and " + arr[end] + " is "
                        + ans.get(ans.size() - 1));
                start++;
                end++;
                if (!negativeList.isEmpty() && negativeList.get(0) < start)
                    negativeList.remove(0);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {-5, -4, -6, -2, 1, 1, 1, 3, -9, 2, 1, 5};
        int k = 3;
        List<Integer> res = firstNegativeList(arr, k);
        System.out.println("Given array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("First negative number of each subbaray of size  " + k);
        System.out.println(res);
    }
}
