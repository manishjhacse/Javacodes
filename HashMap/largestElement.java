import java.util.*;
public class largestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i], i);
        }
        System.out.println("largest element of array is: "+map.lastKey());
        sc.close();
    }
}
