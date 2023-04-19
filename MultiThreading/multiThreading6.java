//single run method
import java.util.*;
class mythread extends Thread{
    public void run()
    {
        String name1=Thread.currentThread().getName();
        if(name1.equals("CALC"))
        {
            cal();
        }
        else{
            message();
        }
      
    }
    public void cal()
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
    public void message()
    {
        System.out.println("message thread");
       try{
        for(int i=0;i<4;i++)
        {
            System.out.println("focus");
            Thread.sleep(2000);
        }
       }
       catch(Exception e){
        System.out.println("something went wrong");
       }
    }
}

public class multiThreading6 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        mythread thread1=new mythread();
        mythread thread2=new mythread();
        thread1.setName("CALC");
        thread2.setName("MESSAGE");
        thread1.start();
        thread2.start();
    }
}
