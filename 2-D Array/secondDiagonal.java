public class secondDiagonal {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,0},
            {4,5,6,56},
            {7,8,9,12},
            {5,6,3,2}
        };
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++)
        {
            int j=0;
            while(i+j<c-1)
            {
                System.out.print(arr[i][j]+" ");
                j++;
            }
        }
    }
}
