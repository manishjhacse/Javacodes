public class string2 {
    public static void main(String[] args) {
        String s1="manish";
        String s2="manish";
        String s3=new String("manish");
        String s4=new String("manish");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        /*
         s1==s2 will gives true value because s1 and s2 has the address of same object because duplicates are not allowed in this case 
         but s3==s4  gives false as s3 and s4 are addressing the different objects because buplicatrs are allowed in this case
         */
    }
}
