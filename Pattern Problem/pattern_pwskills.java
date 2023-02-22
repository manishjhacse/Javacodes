import java.util.*;
public class pattern_pwskills {
    public static void main(String args[])
    {
        System.out.println("Enter the value of n:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||(j<=(n-1)/2&&(i==0||i==(n-1)/2))||(j==(n-1)/2&&i<=(n-1)/2))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||j==n-1||((i+j==n-1||i==j)&&i>=(n-1)/2))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(((i==0||i==(n-1)/2||i==n-1)&&j<=(n-1)/2)||(j==0&&i<=(n-1)/2)||(j==(n-1)/2&&i>=(n-1)/2))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||(i+j==(n-1)/2+1||(i-j==(n-1)/2-1)))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||i==(n-1)||j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||i==n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||i==n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
         System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(((i==0||i==(n-1)/2||i==n-1)&&j<=(n-1)/2)||(j==0&&i<=(n-1)/2)||(j==(n-1)/2&&i>=(n-1)/2))
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
