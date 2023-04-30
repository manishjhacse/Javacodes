// OUTPUT:
// Enter a string: 
// manish jha
// Before: manish jha
// After: hsinam ahj 
import java.util.*;
public class reverseString3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        String s2="";
        String sarr[]=s.split(" ");
        for(int i=0;i<sarr.length;i++)
        {
            for(int j=sarr[i].length()-1;j>=0;j--)
            {
                s2=s2+sarr[i].charAt(j);
            }
            s2=s2+" ";
        }
        System.out.println("Before: "+s);
        System.out.println("After: "+s2);
        sc.close();
    }
}
