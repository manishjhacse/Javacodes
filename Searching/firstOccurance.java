import java.util.*;
class firstOccurance{
    public static int find_FirstOccurance(int arr[],int x)
    {
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
            {
                res= mid;
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array in sorted form: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search in array: ");
        int x=sc.nextInt();
        int result=find_FirstOccurance(arr,x);
        if(result==-1)
        {
            System.out.println("Searched element is not found in an array.");
        }
        else{
            System.out.println("Searched element's first location is "+result);
        }
        sc.close();
    }

}