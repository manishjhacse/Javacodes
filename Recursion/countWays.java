//A person can climb 1 or 2 stairs at a time count number of ways to reach the top.
import java.util.*;
public class countWays {
    public static int count_ways(int n){
        if(n<=1)
        {
            return n;
        }
        else{
            return count_ways(n-1)+count_ways(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n=sc.nextInt();
        int number_of_ways=count_ways(n+1);
        System.out.println("The number of ways to reach the top is: "+number_of_ways);
        sc.close();
    }
}
