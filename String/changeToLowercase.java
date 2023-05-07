public class changeToLowercase {
    public static void main(String[] args) {
        String s="Manish Kumar Jha";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                s=s.substring(0, i)+(char)(s.charAt(i)+32)+s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
