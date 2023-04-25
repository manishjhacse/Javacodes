//Time complexity = O(n)
//Space complexity= O(1)
import java.util.*;
class linearSearch{
    public static int linear_search(int arr[],int x){
        int ind=-1;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                ind=i;
                break;
            }
        }
        return ind;
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
        System.out.print("Enter the element to search in array: ");
        int x=sc.nextInt();
        int ind=linear_search(arr,x);
        if(ind==-1)
        {
            System.out.println("Searched element is not found in an array.");
        }
        else{
            System.out.println("Searched element is found at location "+ind);
        }
        sc.close();
    }

}