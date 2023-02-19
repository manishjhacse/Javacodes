/*
print this pattern where n=10
****      
*   *     
*   *     
*   *     
*   *     
*   *     
*   *     
*   *     
*   *     
****  

 */

import java.util.Scanner;
                                                                                                                                                     
public class pattern3 {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0&&j<(n-1)/2 || j==0|| i==n-1&&j<(n-1)/2||j==(n-1)/2&&i>0&&i<n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();    
        }
    }
}
