public class sumOfArray {
    public static int sum_of_array(int []arr,int n)
    {
        if(n<0)
        return 0;
        else
        return arr[n]+sum_of_array(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[]={56,-22,56,8,-1,569,20};
        int n=arr.length-1;
        System.out.println("sum of elements of array is: "+sum_of_array(arr, n));

    }
}
