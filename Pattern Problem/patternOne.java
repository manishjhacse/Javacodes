

/*print pattern

*****
*   *
*   *
*   *
*****
 
*/
import java.util.Scanner;
public class patternOne {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n)
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
