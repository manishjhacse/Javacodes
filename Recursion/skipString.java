public class skipString {
    public static void skip_String(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        if (str.startsWith("apple")) {
            skip_String(str.substring(5), ans);
        } else {
            ans = ans + str.charAt(0);
            skip_String(str.substring(1), ans);
        }
    }

    public static String skip_String2(String str) {
        if (str.length() == 0)
            return "";
        if (str.startsWith("apple")) {
            return skip_String2(str.substring(5));
        } else {
            return str.charAt(0) + skip_String2(str.substring(1));
        }

    }

    public static void main(String[] args) {
        String str = "bananaappleorange";
        skip_String(str, "");
        String ans2 = skip_String2(str);
        System.out.println(ans2);
    }
}
