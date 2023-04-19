public class changingThreadName {
    public static void main(String[] args) {
        System.out.println("Before changing..........");
        String name = Thread.currentThread().getName();
        System.out.println("current thread is " + name);
        System.out.println("The priority of " + name + " thread is " + Thread.currentThread().getPriority());
        System.out.println("After changing");
        Thread t = Thread.currentThread();
        t.setName("Manish");
        t.setPriority(1);
        String name1 = Thread.currentThread().getName();
        System.out.println("current thread is " + name1);
        System.out.println("The priority of " + name1 + " thread is " + Thread.currentThread().getPriority());
    }
}
