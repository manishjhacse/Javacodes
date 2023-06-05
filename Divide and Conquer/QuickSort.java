import java.util.*;
public class QuickSort {
    public static int partition(int arr[],int l,int h)
    {
        int i=l;
        int pivort=arr[l];
        for(int j=l+1;j<=h;j++)
        {
            if(arr[j]<pivort)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=pivort;
        arr[l]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void quick_Sort(int []arr,int l,int h)
    {
        if(l<h)
        {
            int m=partition(arr,l,h);
            quick_Sort(arr,l,m-1);
            quick_Sort(arr, m+1, h);
        }
    }
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
        System.out.println("Array before sorting is: ");
        System.out.println(Arrays.toString(arr));
        quick_Sort(arr,0,n-1);
        System.out.println("Array after sorting is: ");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
