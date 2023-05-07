import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String s1="The classroom";
        String s2="School master";
        s1=s1.replace(" ","");
        s2=s2.replace(" ", "");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char ar1[]=s1.toCharArray();
        char ar2[]=s2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(Arrays.equals(ar1,ar2))
        {
            System.out.println("It is an anagram.");
        }
        else{
            System.out.println("It is not an anagram.");
        }
    }
}
