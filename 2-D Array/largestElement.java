public class largestElement {
    public static void main(String[] args) {
        int arr[][]={
            {11,2,4,0},
            {2,5,7,-9},
            {4,2,16,9}
        };
        int row=arr.length;
        int col=arr[0].length;
        int max=arr[0][0];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Maximum number of this 2-D array is: "+max);
    }
}
