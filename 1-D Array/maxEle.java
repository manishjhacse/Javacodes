public class maxEle {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,43};
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum number in array is "+max);
    }
}
