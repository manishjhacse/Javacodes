public class mainthread {
    public static void main(String[] args) {
        
        String name=Thread.currentThread().getName();
        System.out.println("current thread is "+name);
        System.out.println("The priority of "+name+" thread is "+Thread.currentThread().getPriority());

    }
}
