public class workingOfFnCall {
    // public static void main(String[] args) {
    //     print1();
    // }
    // static void print1(){
    //     System.out.println("1");
    //     print2();
    // }
    // static void print2(){
    //     System.out.println("2");
    //     print3();
    // }
    // static void print3(){
    //     System.out.println("3");
    //     print4();
    // }
    // static void print4(){
    //     System.out.println("4");
    //     print5();
    // }
    // static void print5(){
    //     System.out.println("5");
    // }
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
