public class middleRowCol {
    public static void printmiddle(int a[][],int size)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(j==(size-1)/2)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
         
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i==(size-1)/2&&i!=j)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
         
        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4,5},
            {3,4,5,6,7},
            {7,6,5,4,3},
            {8,7,6,5,4},
            {1,2,37,8,0}
        };
        int size=arr.length;
        printmiddle(arr,size);
    }
}
