public class duplicateNumber {
    public static void main(String[] args) {
        int arr[]={5,2,6,3,4,4};
        int n=arr.length;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Dublicate element found is: "+arr[i]);
                    flag=1;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("No duplicate element found in array.");
        }
    }
}
