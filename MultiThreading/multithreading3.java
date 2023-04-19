class MyThread extends Thread{
    public void run()
    {
        System.out.println("chlid thread");
    }
}
public class multithreading3 {
    public static void main(String[] args) {
        System.out.println("main thread");
        MyThread t= new MyThread();
        t.start();
    }
}
