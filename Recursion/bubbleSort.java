import java.util.Arrays;

public class bubbleSort {
    public static void bubble(int arr[],int n,int c){
        if(n==0)
        return;
        if(c<n){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr, n, c+1);
        }else{
            bubble(arr, n-1, 0);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,3,5,2,1,3};
        int n=arr.length;
        bubble(arr, n-1, 0);
        System.err.println(Arrays.toString(arr));
    }
}
