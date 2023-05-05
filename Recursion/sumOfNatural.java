//Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
import java.util.*;
public class sumOfNatural {
    public static int sum_of_series(int n)
    {
        if(n==1)
        {
            return n;
        }
        else if(n%2==0)
        {
            return (-n)+sum_of_series(n-1);
        }
        else{
            return n+sum_of_series(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int result=sum_of_series(n);
        System.out.println("Sum of series is: "+result);
        sc.close();
    }
}
