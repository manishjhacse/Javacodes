public class factorial {
    public static int factorial_num(int n)
    {
        if(n==1||n==0)
        {
            return n;
        }
        else{
            return n*factorial_num(n-1);
        }
    }
    public static void main(String[] args) {
        int num=5;
        int result=factorial_num(5);
        System.out.println("The factorial of "+num+" is: "+result);
    }
}
