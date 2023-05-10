import java.util.*;
public class TilesProblem {
    public static int total_Ways(int n)
    {
        if(n<=3)
        {
            return n;
        }
        else{
            return (total_Ways(n-1)+total_Ways(n-2));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int ways=total_Ways(n);
        System.out.println("Total number of ways to tile the board is: "+ways);
        sc.close();
    }
}
