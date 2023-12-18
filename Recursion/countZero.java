import java.util.*;
public class countZero {
    public static int noOfZero(int n,int count){
        if(n==0)
        return count;
        count=n%10==0?count+1:count;
        return noOfZero(n/10, count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("No. of zeros in digit is: "+noOfZero(n,0));
        sc.close();
    }
}
