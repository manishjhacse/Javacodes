import java.util.*;
public class isEven {
    public static boolean is_even(int num)
    {
        if((num&1)==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(is_even(num));
        sc.close();
    }
}
