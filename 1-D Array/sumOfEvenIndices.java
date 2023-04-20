public class sumOfEvenIndices {
    public static void main(String[] args) {
        int arr[]={3,20,4,6,9};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i+=2)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of even Indices of array is "+sum);
    }
}
