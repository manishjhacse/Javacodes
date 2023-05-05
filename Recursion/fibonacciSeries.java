import java.util.*;
public class fibonacciSeries {
    public static int fibonnaci_number(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else{
            return fibonnaci_number(n-1)+fibonnaci_number(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of term: ");
        int n=sc.nextInt();
        int result=fibonnaci_number(n);
        System.out.println("Fibonacci number of given term is: "+result);
        sc.close();
    }
}
