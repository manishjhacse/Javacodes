import java.util.*;
public class oneInSortedBinaryArray {
    public static int number_of_one(int arr[])
    {
        int ind=-1;
        int result=0;
        int lb=0,ub=arr.length-1;
        while(lb<=ub)
        {
            int mid=lb+(ub-lb)/2;
            if(1==arr[mid])
            {
                ind=mid;
                ub=mid-1;
            }
            else if(1<arr[mid])
            {
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        if(ind==-1)
        {
            return 0;
        }
        else{
            result=arr.length-ind;
        }
        return result;
        
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,1,1,1,1,1,1};
        int result=number_of_one(arr);
        System.out.println("Total number of 1 in given binary array is: "+result);
    }
}

