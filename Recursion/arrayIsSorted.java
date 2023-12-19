import java.util.*;
public class arrayIsSorted {
    public static boolean isSorted(int arr[],int index){
     if(index==arr.length-1){
        return true;
     }
     return arr[index]<=arr[index+1] && isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(isSorted(arr, 0)){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }
}
