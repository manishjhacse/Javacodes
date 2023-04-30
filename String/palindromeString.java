import java.util.*;
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check it is palindrome or not: ");
        String s=sc.next();
        int len=s.length();
        String s2="";
        for(int i=len-1;i>=0;i--)
        {
            s2=s2+s.charAt(i);
        }
        if(s.equals(s2))
        {
            System.out.println("Given string is palindrome.");
        }
        else{
            System.out.println("Given string is not palindrome.");
        }
        sc.close();
    }
    
}
