public class forEach {
    public static void main(String[] args) {
        int arr[]={34,4,3,6,7,1,21,54,65,53};
        int n=arr.length;
        for(int x:arr)
        {
            if(x%2==0)
            {
                System.out.print(x+" ");
            }
        }
    }
}
