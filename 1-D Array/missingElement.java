public class missingElement {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,3,7};
        int n=arr.length;
        int m=n+1;
        int sum_natural_num=(m*(m+1))/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int missing_numb=0;
        missing_numb=sum_natural_num-sum;
        System.out.println("Missing number is "+missing_numb);
    }
}
