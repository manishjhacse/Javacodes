public class printMultiple {
    public static void print_Multiple(int n,int k)
    {
        if(k==1)
        {
            System.out.println(n);
            return;
        }
        print_Multiple(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        print_Multiple(5, 9);
        
    }
}
