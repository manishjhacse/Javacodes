import java.util.*;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int flag=0;
        while(num>0)
        {
            int rem=num%2;
            num=num/2;
            if(num>1 && rem!=0)
            {
                flag=1;
                break;
            }
        }
        if(flag!=0)
        {
            System.out.println("Number is not a power of 2");
        }
        else{
            System.out.println("Number is a power of 2");
        }
        sc.close();    
    }
}
