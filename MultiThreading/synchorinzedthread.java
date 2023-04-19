class car implements Runnable{
    synchronized public void run()
    {
        try{
            System.out.println(Thread.currentThread().getName()+" has entered the parking");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" got into car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" came back and parked the car");
            
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
    }
}
public class synchorinzedthread {
    public static void main(String[] args) {  
        car c=new car();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);
        t1.setName("Father");
        t2.setName("Daughter");
        t3.setName("Son");
        t1.start();
        t2.start();
        t3.start();

        
    }
}
