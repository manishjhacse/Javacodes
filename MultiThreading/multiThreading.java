class print implements Runnable{

    public void run()
    {
        System.out.println("print method");
        try{
            for(int i=0;i<2;i++)
            {
                System.out.println("focus");
                Thread.sleep(3000);
            }

        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
    }

}
public class multiThreading {
    public static void main(String[] args) throws Exception {
        System.out.println("main method");
        print p=new print();
        Thread t1=new Thread(p);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println("main thread ends");

    }
}
