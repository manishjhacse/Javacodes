import java.util.Scanner;
public class input
{
    public static void main( String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Age is "+age);
        System.out.println("Enter average");
        float avg=scan.nextFloat();
        System.out.println("average is "+avg);
        System.out.println("Enter a character");
        char ch=scan.next().charAt(0);
        System.out.println("charater is "+ch);
        System.out.println("enter a string");
        String name=scan.next();
        System.out.println("string is "+name);
        
}

}