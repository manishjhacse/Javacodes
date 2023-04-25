import java.util.*;
public class bubbleSortPass {
    public static int bubbleSort(int arr[])
    {
        int n=arr.length;
        int pass=0;
        for(int i=0;i<n;i++)
        {
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]<arr[j+1])
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
            pass++;
        }
        return pass;
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        int pass=bubbleSort(arr);
        System.out.println("Numbers of pass required to sort array is: "+pass);
        
    } 
}
