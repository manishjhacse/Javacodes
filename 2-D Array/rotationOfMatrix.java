public class rotationOfMatrix{
    public static void rotateMatrix(int arr[][])
    {
        int row=arr.length;
        int col=arr[0].length;
        //transpose of matrix
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<col;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //rotate by 90
        for(int i=0;i<row;i++)
        {
            int li=0;
            int ri=col-1;
            while(li<ri)
            {
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;
                li++;
                ri--;

            }
        }
        
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8}
        };
        rotateMatrix(arr);
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr[0].length;j++)
        {
            System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
       }

    }
}