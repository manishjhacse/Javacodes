import java.util.ArrayList;

public class permutation {
    static void printPermutation(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(0);
        int n = ans.length();
        for (int i = 0; i <= n; i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, n);
            printPermutation(str.substring(1), f + ch + s);
        }
    }

    static ArrayList<String> returnListPermutaions(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = str.charAt(0);
        int n = ans.length();
        for (int i = 0; i <= n; i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            list.addAll(returnListPermutaions(str.substring(1), f + ch + s));
        }
        return list;
    }

    static void listPermutation(String str, String ans, ArrayList<String> list) {
        if (str.isEmpty()) {
            list.add(ans);
            return;
        }
        char ch = str.charAt(0);
        int n = ans.length();
        for (int i = 0; i <= n; i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, n);
            String t = f + ch + s;
            listPermutation(str.substring(1), t, list);
        }
    }

    public static void main(String[] args) {
        printPermutation("abc", "");
        System.out.println();
        ArrayList<String> ans = returnListPermutaions("abc", "");
        System.out.println(ans);
        ArrayList<String> ans2 = new ArrayList<>();
        System.out.println(ans2);
        listPermutation("abc", "", ans2);
        System.out.println(ans2);
    }
}
