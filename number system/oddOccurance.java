public class oddOccurance {
    public static int odd_occurance(int arr[])
    {
        int n=arr.length;
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={9,3,2,5,6,4,3,5,2,0,0,9,9,6,4}; 
        System.out.println("Odd occurance in array is: "+odd_occurance(arr));
    }
}
