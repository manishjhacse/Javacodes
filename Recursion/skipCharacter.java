public class skipCharacter {
    public static void skip_Character(String str, String ans) {
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        if (str.charAt(0) != 'a' && str.charAt(0) != 'A')
            ans = ans + str.charAt(0);
        skip_Character(str.substring(1), ans);
    }

    public static String skip_Character2(String str) {
        String ans = "";
        if (str.length() == 0)
            return ans;
        if (str.charAt(0) != 'a' && str.charAt(0) != 'A')
            ans = ans + str.charAt(0);
        return ans + skip_Character2(str.substring(1));

    }

    public static void main(String[] args) {
        String str = "abschjsasaakjkaaa";
        skip_Character(str,"");
        String ans2 = skip_Character2(str);
        System.out.println(ans2);
    }
}
