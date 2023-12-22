import java.util.ArrayList;

public class linearSearch2 {
    public static ArrayList<Integer> findAllIndex(int arr[], int index, int target, ArrayList<Integer> list) {
        if (index == arr.length - 1)
            return list;
        if (arr[index] == target)
            list.add(index);
        return findAllIndex(arr, index + 1, target, list);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 4, 5, 6, 8, 6, 0 };
        ArrayList<Integer> ans = findAllIndex(arr, 0, 6, new ArrayList<Integer>());
        System.out.println(ans);
    }
}
