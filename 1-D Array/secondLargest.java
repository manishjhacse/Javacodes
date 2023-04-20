public class secondLargest {
    public static void main(String[] args) {
        int arr[]={6,7,5,2,15,9};
        int n=arr.length;
        int max1=arr[0];
        int max2=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
        }
        System.out.println("maximum number is "+max1);
        System.out.println("2nd maximum number is "+max2);
    }
}
