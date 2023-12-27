import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetIteration {
    static List<List<Integer>> subset(int arr[]) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));// copy the ith list from outer list
                internal.add(num);// add the current num in the copy
                outer.add(internal);// add the copy in the ans
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int arr[]) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0, end = 0;
        for (int j = 0; j < arr.length; j++) {
            start = 0;
            if (j > 0 && arr[j] == arr[j - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));// copy the ith list from outer list
                internal.add(arr[j]);// add the current num in the copy
                outer.add(internal);// add the copy in the ans
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int arr2[] = { 1, 2, 2 };
        System.out.println("Array not containing duplicates:");
        System.out.println(subset(arr));
        System.out.println(subsetDuplicate(arr));
        System.out.println("Array containing duplicates: ");
        System.out.println(subset(arr2));
        System.out.println(subsetDuplicate(arr2));
    }
}
