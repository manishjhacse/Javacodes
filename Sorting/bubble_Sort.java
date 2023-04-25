//Time complexity = O(n^2);
//Space complexity = O(1);
import java.util.*;
class bubble_Sort{
    public static void bubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)// is swapped is false then break 
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("unsorted arrray is: ");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
        sc.close();
        
    }
}