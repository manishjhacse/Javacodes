import java.util.*;
public class bubbleSortDescending {
    public static void bubble_sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean check=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    check=true;
                }
            }
            if(!check)
            {
                break;
            }
         
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
