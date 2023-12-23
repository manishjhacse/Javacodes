import java.util.Arrays;

public class selectionSort {
    public static void selection(int arr[],int n,int c,int maxIndex){
        if(n==0)
        return;
        if(c<n){
            if(arr[c]>=arr[maxIndex])
            maxIndex=c;
            selection(arr, n, c+1, maxIndex);
        }else{
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[n-1];
            arr[n-1]=temp;
            selection(arr, n-1, 0, 0);
        }

    }
    public static void main(String[] args) {
        int arr[]={6,2,4,3,0,2,5,12,-56};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
