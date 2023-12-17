public class printn {
    public static void printNumbers(int n){
        if(n==0)
        return;
        System.out.println(n);//this will print n to 1
        printNumbers(n-1);
        System.out.println(n); //this will print 1 to n
    }
    public static void main(String[] args) {
        printNumbers(5);
    }
}
