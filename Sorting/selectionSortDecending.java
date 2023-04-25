import java.util.*;
public class selectionSortDecending {
    public static void selection_sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int max=i;
            for(int j=i;j<n;j++)
            {
                if(arr[j]>arr[max])
                {
                    max=j;
                }
            }
            if(max!=i)
            {
                int temp=arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
