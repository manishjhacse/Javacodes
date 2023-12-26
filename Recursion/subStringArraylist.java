import java.util.ArrayList;

public class subStringArraylist {
    //taking list as an argument and adding substring in it
    public static void SubStringList(String substring, String str,ArrayList<String> list) {
        if (str.isEmpty()) {
            list.add(substring);
            return;
        }
        char ch = str.charAt(0);
        // either we will take a character or we will not take a character
        SubStringList(substring + ch, str.substring(1),list);// taking a character
        SubStringList(substring, str.substring(1),list); // not taking a character
    }
    //returning list and not taking list as an agrument
    public static ArrayList<String> ReturnSubStringList(String substring, String str) {
        if (str.isEmpty()) {
            ArrayList<String>list=new ArrayList<>();
            list.add(substring);
            return list;
        }
        char ch = str.charAt(0);
        // either we will take a character or we will not take a character
        ArrayList<String> left=ReturnSubStringList(substring + ch, str.substring(1));// taking a character
        ArrayList<String> right=ReturnSubStringList(substring, str.substring(1)); // not taking a character
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String str="abc";
        ArrayList<String>subSets=new ArrayList<String>();
        SubStringList("", str,subSets);
       System.out.println(subSets);
       ArrayList<String>subsets2=ReturnSubStringList("", str);
       System.out.println(subsets2);
    }
}
