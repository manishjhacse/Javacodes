public class removeWhitespaces {
    public static void main(String[] args) {
        String s="manish kumar Jha";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                s=s.substring(0,i)+""+s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
