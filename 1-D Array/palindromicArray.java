// Time Complexity = O(n)
//space complexity = O(1)
import java.util.Scanner;
public class palindromicArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int flag=0;
        int arr[];
        arr= new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            if(arr[i]!=arr[n-1-i])
            {
                System.out.println("Array is not palindromic.");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Array is palindromic");
        }
        sc.close();

    }
}
