public class stringcompare {
    public static void main(String[] args) {
        String s1="manish";
        String s2="manish";
        String s3=new String("manish");
        String s4=new String("manish");
        String s5=new String("Manish");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));


    }
}
