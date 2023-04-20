public class firstPeak {
    static int peakele(int a[],int n)
    {
        if(n==1)
        return 0;

        if(a[0]>=a[1])
        return 0;

        if(a[n-1]>=a[n-2])
        return (n-1);

        for(int i=1;i<n-1;i++)
        {
            if(a[i]>=a[i-1]&&a[i]>=a[i+1])
            {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,3,2,3,5};
        int n=arr.length,peak=0;
        System.out.println("First peak element is "+arr[peakele(arr, n)]);
        
    }
}
