import java.util.*;
public class prefixSum {
    public static int sumofarray(int arr[][],int r1,int c1,int r2,int c2)
    {
        int sum=0;
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
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
         int result=sumofarray(arr,r1,c1,r2,c2);
         System.out.println("prefix sum is: "+result);
         sc.close();
    }
}
