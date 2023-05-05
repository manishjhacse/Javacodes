import java.util.*;
public class sumOfDigits {
    public static int sum_of_digits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return (n%10)+sum_of_digits(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int result=sum_of_digits(n);
        System.out.println("The sum of digits of "+n+" is "+result); 
        sc.close();
    }
}
