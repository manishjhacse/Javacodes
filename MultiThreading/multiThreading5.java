import java.util.*;
class calcu1 implements Runnable{
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
class message1 implements Runnable{
    public void run()
    {
        System.out.println("message thread");
       try{
        for(int i=0;i<4;i++)
        {
            System.out.println("focus");
            Thread.sleep(2000);//here it will stop for 2 seconds that is 2000ms
        }
    }
    catch(Exception e)
    {
        System.out.println("something went wrong");
    }
    }
       
}
public class multiThreading5 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        calcu1 c1=new calcu1();
        message1 m1=new message1();
        Thread t1=new Thread(c1);
        Thread t2=new Thread(m1);
        t1.start();
        t2.start();
    }
}
