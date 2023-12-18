import java.util.*;
public class reverseNumber {
    public static int reverse(int n,int reversed){
        if(n==0)
        return reversed;
        reversed=reversed*10+n%10;
        return reverse(n/10, reversed);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int reversed_Number=reverse(n,0);
        System.out.println("Reversed number is: "+reversed_Number);
        sc.close();
    }
}
