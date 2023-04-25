import java.util.*;
public class lastOccurance {
    public static int last_occurance(int arr[],int x)
    {
        int ind=-1;
        int lb=0,ub=arr.length-1;
        while(lb<=ub)
        {
            int mid=lb+(ub-lb)/2;
            if(x==arr[mid])
            {
                ind=mid;
                lb=mid+1;
            }
            else if(x<arr[mid])
            {
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,1,1,2,3,4,4,5,6,6,6,6};
        System.out.println("Enter the element of which you want to know last location: ");
        int target=sc.nextInt();
        int last_ind=last_occurance(arr,target);
        if(last_ind==-1)
        {
            System.out.println("Searched element is not present in array.");
        }
        else{
            System.out.println("Last index of searched element is: "+last_ind);
        }
        sc.close();
    }
}
