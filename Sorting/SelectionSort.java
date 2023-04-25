//Time complexity = O(n^2)
//Space complexity = O(1)
import java.util.*;
public class SelectionSort {
    public static void selection_sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={12,25,41,63,20,-89,232,112};
        selection_sort(arr);
        System.out.println("sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
