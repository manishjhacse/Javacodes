import java.util.*;
public class nonRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            { 
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i))==1)
            {
                System.out.println("First non repeating character is "+str.charAt(i)+" present at index "+i);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("There is no non-repeatinig charater present in the given string");
        }
        sc.close();
    }
}


