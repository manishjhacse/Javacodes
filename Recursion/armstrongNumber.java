import java.util.*;;
public class armstrongNumber {
    public static int power(int x,int n)
    {
        if(n==0)
        return 1;
        else if(n==1)
        return x;
        else{
            int res=power(x, n/2);
            if(n%2==0)
            return res*res;
            else
            return x*res*res;
        }
    }
    public static int number_of_digit(int x)
    {
        int n=0;
        while(x>0)
        {
            n++;
            x=x/10;
        }
        return n;
    }
    public static boolean is_Armstrong(int x)
    {
        int temp=x,sum=0;
        int n=number_of_digit(x);
        while(temp>0)
        {
            int rem=temp%10;
            sum=sum+power(rem,n);
            temp=temp/10;
        }
        if(sum==x)
        return true;
        else
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check it is an Armstrong number or not: ");
        int x=sc.nextInt();
        boolean res=is_Armstrong(x);
        System.out.println("Given number is an Armstrong number: "+res);
        sc.close();

    }
}
