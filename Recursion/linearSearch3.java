import java.util.ArrayList;
public class linearSearch3 {
    public static ArrayList<Integer> findAllIndex(int arr[], int index, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (index == arr.length - 1)
            return list;
        if (arr[index] == target)
            list.add(index);
        ArrayList<Integer> ansFromBleowCalls = findAllIndex(arr, index + 1, target);
        list.addAll(ansFromBleowCalls);
        return list;

    }
      public static void main(String[] args) {
        int arr[] = { 6, 3, 4, 5, 6, 8, 6, 0 };
        ArrayList<Integer> ans = findAllIndex(arr, 0, 6);
        System.out.println(ans);
    }
}
