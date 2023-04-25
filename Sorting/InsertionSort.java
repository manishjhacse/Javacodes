//Time complexity = O(n^2)
//Space complexity = O(1)
import java.util.*;
public class InsertionSort {
    public static void insertion_sort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={20,50,25,67,12,15,0,3,-56};
        System.out.println("Unsorted array is:");
        System.out.println(Arrays.toString(arr));
        insertion_sort(arr);
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}
