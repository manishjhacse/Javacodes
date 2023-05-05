import java.util.*;
public class power {
    public static int power_of_n(int n,int a)
    {
        if(a==0)
        {
            return 1;
        }
        else if(a==1)
        {
            return n;
        }
        else{
            return n*power_of_n(n, a-1);
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number and it's power: ");
    int n=sc.nextInt();
    int a=sc.nextInt();
    int power=power_of_n(n,a);
    System.out.println("result: "+power);
    sc.close();
    }
}
