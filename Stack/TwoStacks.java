import java.util.*;

public class TwoStacks {
    static int TwoStacksRecursion(int x, int[] list1, int[] list2, int sum, int count) {
        if (sum > x)
            return count;

        if (list1.length == 0 || list2.length == 0)
            return count;

        int ans1 = TwoStacksRecursion(x, Arrays.copyOfRange(list1, 0, list1.length - 1), list2,
                sum + list1[list1.length - 1], count + 1);
        int ans2 = TwoStacksRecursion(x, list1, Arrays.copyOfRange(list2, 0, list2.length - 1),
                sum + list2[list2.length - 1], count + 1);
        return Math.max(ans1, ans2);

    }

    static int Two_Stacks(int x, int[] list1, int[] list2) {
        return TwoStacksRecursion(x, list1, list2, 0, 0) - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, target;
        System.out.println("Enter the size of array 1 and array 2");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Enter the Max sum");
        target = sc.nextInt();
        int a[] = new int[n1];
        int b[] = new int[n2];
        System.out.println("Enter the element of list 1");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element of list 2");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Max element that can be pop from these two array is: "+Two_Stacks(target, a, b));
        sc.close();
    }
}
