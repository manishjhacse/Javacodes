import java.util.*;
public class patternOf5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=scan.nextInt();
        scan.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==n-1||i==0)&&j<=(n-1)/2||j==0&&i<=(n-1)/2||j==(n-1)/2&&i>=(n-1)/2||i==(n-1)/2&&j<=(n-1)/2)
                {
                   if((i==(n-1)/2||i==n-1)&&j==(n-1)/2)
                   {
                    System.out.print(" ");
                   }
                    else{
                        System.out.print("*");
                    }
                   
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
