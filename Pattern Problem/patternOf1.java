import java.util.*;
public class patternOf1 {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the value of n: ");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        scan.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j==(n-1)/2&&j>0||i==n-1||j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
    }
}
