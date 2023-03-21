import java.util.*;
public class finallyBlock {
    public static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);
        try{
            num=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter a number");
        }
        finally{
            sc.close();
            System.out.println("resource closed");
        }
        System.out.println(num);
    }
}
