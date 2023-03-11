import java.util.Scanner;
public class patternOf3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n=scan.nextInt();
        scan.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                 if(((i==0||i==n-1)&&j<=(n-1)/2)||(((i>0&&i<(n-1)/2)||(i>(n-1)/2&&i<n-1))&&j==(n-1)/2+1)||(j>=((n-1)/2)/2&&j<=(n-1)/2&&i==(n-1)/2))
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
