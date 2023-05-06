import java.util.*;
public class binarySearch {
    public static int binary_search(int arr[],int left,int right,int target)
    {
        int ind=-1;
        while(left<=right)
        {
           int mid=left+(right-left)/2;
           if(arr[mid]==target)
           {
            return mid;
           }
           else if(arr[mid]<target)
           {
               return binary_search(arr, mid+1, right, target);
            }
            else{
               return binary_search(arr, left, mid-1, target);
           }
        }
        return ind;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched:");
        int target =sc.nextInt();
        int index=binary_search(arr, 0, arr.length-1, target);
        if(index==-1)
        System.out.println("Element not found");
        else
        System.out.println("Element found at index "+index);
        sc.close();
    }
}
