import java.util.*;
public class setBits {
    public static int numberOfSetBits(int num)
    {
        int count=0;
        while(num>0)
        {
            if((num&1)==1)
            {
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int res=numberOfSetBits(num);
        System.out.println("Number of set bits is: "+res);
        sc.close();

    }
}
