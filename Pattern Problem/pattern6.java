// print 
//    *   
//   * *  
//  *   * 
// *     *
// *******
       
import java.util.Scanner;
public class pattern6 {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=scan.nextInt();
        scan.close();
       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j==(n-1)/2||j-i==(n-1)/2||i==(n-1)/2+1&&i<=(n-1)/2+1)
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
