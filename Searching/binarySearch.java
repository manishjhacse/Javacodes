//Time complexity = O(logN)
//Space complexity= O(1)
import java.util.*;
class binarySearch{
    public static int binary_Search(int arr[],int x)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int arr[]={2,5,6,7,8,10,15,17};
        System.out.print("Enter the element to search in array: ");
        int x=sc.nextInt();
        int result=binary_Search(arr,x);
        if(result==-1)
        {
            System.out.println("Searched element is not found in an array.");
        }
        else{
            System.out.println("Searched element is found at location "+result);
        }
        sc.close();
    }

}