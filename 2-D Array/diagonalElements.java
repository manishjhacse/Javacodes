import java.util.*;
public class diagonalElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row of a square matrix:");
        int r=sc.nextInt();
        int arr[][]=new int[r][r];
        System.out.println("enter the elements of a matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(i==j || i+j==r-1)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        sc.close();
        
    }
}
