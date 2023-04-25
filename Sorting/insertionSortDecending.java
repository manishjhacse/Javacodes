import java.util.*;
public class insertionSortDecending {
    public static void insertion_sort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j]>arr[j-1])
            {
                int temp= arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
