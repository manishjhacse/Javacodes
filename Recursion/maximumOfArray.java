public class maximumOfArray {
    public static int maximum_element(int arr[],int n)
    {
        if(n==1)
        return arr[0];
        else
        return Math.max(arr[n-1], maximum_element(arr, n-1));
    }
    public static void main(String[] args) {
    int arr[]={13,1,-3,22,5};
    int n=arr.length;
    int ans=maximum_element(arr,n);
    System.out.println("maximum element of array is: "+ans);
    
    }
}
