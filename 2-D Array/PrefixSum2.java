import java.util.*;
public class PrefixSum2 {
    public static void prefixArray(int arr[][])
    {
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                arr[i][j]+=arr[i][j-1];
            }
        }
        for(int j=0;j<col;j++)
        {
            for(int i=1;i<row;i++)
            {
                arr[i][j]+=arr[i-1][j];
            }
        }
    }
    public static int prefixSum(int arr[][],int r1,int c1,int r2,int c2)
    {
        int sum=0,up=0,left=0,repeated=0,result=0;
        sum=arr[r2][c2];
        up=arr[r1-1][c2];
        left=arr[r2][c1-1];
        repeated=arr[r1-1][c1-1];
        result=sum-up-left+repeated;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row=sc.nextInt();
        System.out.println("Enter the number of colums");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the elements of matrix: ");
        for(int i=0;i<row;i++)
        {
           for(int j=0;j<col;j++)
           {
               arr[i][j]=sc.nextInt();
           }
        }
        System.out.println("enter the value of r1 and c1");
        int r1=sc.nextInt(),c1=sc.nextInt();
        System.out.println("enter the value of r2 and c2");
        int r2=sc.nextInt(),c2=sc.nextInt();
        prefixArray(arr);
        int result=prefixSum(arr, r1, c1, r2, c2);
        System.out.println("Prefix sum is: "+result);
        sc.close();
    }
}
