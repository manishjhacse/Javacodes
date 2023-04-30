// OUTPUT:
// Enter a string to be reversed: 
// manish jha
// ahj hsinam
import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to be reversed: ");
        String s=sc.nextLine();
        int len=s.length();
        String s2="";
        for(int i=len-1;i>=0;i--)
        {
            s2=s2+s.charAt(i);
        }
        System.out.println(s2);
        sc.close();
    }
}
