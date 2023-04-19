import java.util.*;
class calcu extends Thread{
    public void run()
    {
        System.out.println("calculation Thread");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        int res=num1+num2;
        sc.close();
        System.out.println("Result is "+res);
    }
}
class message extends Thread{
    public void run()
    {
        System.out.println("message thread");
        for(int i=0;i<4;i++)
        {
            System.out.println("focus");
        }
    }
}
public class multiThreading4 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        calcu t1=new calcu();
        message t2=new message();
        t1.start();
        t2.start();
    }
}
