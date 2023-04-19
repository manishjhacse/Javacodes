class demo implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("focus");
                Thread.sleep(2000);
            } catch (Exception e) {

                System.out.println("thread is interrupted");
            }

        }

    }
}

public class interruptMethod {
    public static void main(String[] args) {
        demo d = new demo();
        Thread t1 = new Thread(d);
        t1.start();
        t1.interrupt();
    }
}
