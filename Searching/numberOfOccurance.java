import java.util.*;
public class numberOfOccurance {
    public static int first_occurance(int arr[],int x)
    {
        int ind=-1;
        int lb=0,ub=arr.length-1;
        while(lb<=ub)
        {
            int mid=lb+(ub-lb)/2;
            if(x==arr[mid])
            {
                ind=mid;
                ub=mid-1;
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
        int arr[]={2,5,5,5,6,6,8,9,9,9};
        System.out.println("Enter the number of which you want to know occurance");
        int x=sc.nextInt();
        int li=first_occurance(arr,x);
        int ui=last_occurance(arr,x);
        if(li==-1 || ui==-1)
        {
            System.out.println("searched element is not present in array");
        }
        else if(li==ui)
        {
            System.out.println("number of occurance is: 1");
        }
        else{
            System.out.println("number of occurance is: "+(ui-(li-1)));
        }
        
    }
}

