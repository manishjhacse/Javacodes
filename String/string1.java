public class string1 {
    public static void main(String[] args) {
        String s1="Manish";//duplicates not allowed
        System.out.println(s1);
        String s2=new String("Manish");//duplicates allowed
        System.out.println(s2);
        char []ch={'M','a','n','i','s','h'};
        String s3=new String(ch);
        System.out.println(s3);
    }
}
