// OUTPUT:
// Enter a string: 
// manish jha
// Before: manish jha
// After: hsinam ahj
import java.util.*;
public class reverseString4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        String s2="";
        String sarr[]=s.split(" ");
        for(String ele:sarr)
        {
            for(int i=ele.length()-1;i>=0;i--)
            {
                s2=s2+ele.charAt(i);
            }
            s2=s2+" ";
        }
        System.out.println("Before: "+s);
        System.out.println("After: "+s2);
        sc.close();
    }
}
