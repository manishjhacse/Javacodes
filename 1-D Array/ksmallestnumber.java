import java.util.*;
public class ksmallestnumber {
    static int smallNumber(int arr[],int k)
    {
        int n=arr.length;
        int min=0;
        for(int i=1;i<k;i++)
        {

            arr[min]=Integer.MAX_VALUE;
            min=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }

        }
        return arr[min];
    }
    public static void main(String[] args) {
        int arr[]={-1,-8,-9,0,1,2,5,-3};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        sc.close();
        if(k>arr.length)
        {
            System.out.println("k can not be greater than the the length of array");
            return;
        }
        int minnum=smallNumber(arr, k);
        System.out.println("Kth smallest number is: "+minnum);
        
    }
}
