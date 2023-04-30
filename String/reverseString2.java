// OUTPUT:
// Enter a string: 
// manish jha
// Before: manish jha
// After: jha manish 
import java.util.*;
public class reverseString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        String s2="";
        int len=s.length();
        String []sarr=s.split(" ");
        for(int i=sarr.length-1;i>=0;i--)
        {
            s2=s2+sarr[i]+" ";
        }
        System.out.println("Before: "+s);
        System.out.println("After: "+s2);
        sc.close();
    }
}
