public class changeToUppercase {
    public static void main(String[] args) {
        String s="manish kumar jha";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {

                s=s.substring(0, i)+(char)(s.charAt(i)-32)+s.substring(i+1);
                
            }
        }
        System.out.println(s);
    }
}
