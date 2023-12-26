public class subString {
    public static void printSubString(String substring, String str) {
        if (str.isEmpty()) {
            System.out.print(substring + " ");
            return;
        }
        char ch=str.charAt(0);
        // either we will take a character or we will not take a character
        printSubString(substring + ch, str.substring(1));// taking a character
        printSubString(substring, str.substring(1));// not taking a character
    }

    public static void main(String[] args) {
        printSubString("", "abc");
    }
}
