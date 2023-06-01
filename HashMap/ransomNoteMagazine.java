import java.util.*;
public class ransomNoteMagazine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter RansomNote: ");
        String ransomNote=sc.next();
        System.out.print("Enter Magazine: ");
        String magazine=sc.next();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch=ransomNote.charAt(i);
            if(map1.containsKey(ch))
            {
                map1.put(ch,map1.get(ch)+1);
            }
            else{
                map1.put(ch,1);
            }
        }      
        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            if(map2.containsKey(ch))
            {
                map2.put(ch,map2.get(ch)+1);
            }
            else{
                map2.put(ch,1);
            }
        } 
        boolean res=true;
        for(Map.Entry<Character,Integer> e:map1.entrySet())
        {
            char ch=e.getKey();
            if(!map2.containsKey(ch) || e.getValue()>map2.get(ch))
            {
                res=false;
                break;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
