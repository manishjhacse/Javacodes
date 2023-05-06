import java.util.*;
import java.math.*;
public class powerBigger {
    public static BigInteger findPower(BigInteger a,int b)
    {
        BigInteger res,finalres;
        if(b==0)
        {
            return BigInteger.valueOf(1);
        }
        else if(b==1)
        {
            return a;
        }
        else{
            res=findPower(a, b/2);
            finalres=res.multiply(res);
            if(b%2==0)
            {
                return finalres;
            }
            else{
                return a.multiply(finalres);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and it's power: ");
        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();
        BigInteger res=findPower(a,b);
        System.out.println("The result is "+res);
        sc.close();

    }
}
