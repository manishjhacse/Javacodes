public class SelectionSortIteration {
    public static int selection_sort(int arr[])
    {
        int n=arr.length;
        int iteration=0;
        for(int i=0;i<n;i++)
        {
            int max=i;
            for(int j=i;j<n;j++)
            {
                if(arr[j]>arr[max])
                {
                    max=j;
                }
            }
            if(max!=i)
            {
                int temp=arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
            }
            iteration++;
        }
        return iteration;
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        int iteration=selection_sort(arr);
        System.out.println("Number of iteration is: "+iteration);
        
    }
}