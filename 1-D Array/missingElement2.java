public class missingElement2 {
    static int missingNumber(int a[],int n)
    {
        int total=1;
        for(int i=2;i<=(n+1);i++)
        {
            total+=i;
            total-=a[i-2];
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7,6};
        int size=arr.length;
        System.out.println("Missing number is "+missingNumber(arr, size));
    }
}
