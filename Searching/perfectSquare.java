import java.util.*;
public class perfectSquare {
    public static boolean perfect_Square(int x){
        boolean result=false;
        int lb=0,ub=x;
        while(lb<=ub)
        {
            int mid=lb+(ub-lb)/2;
            int sq=mid*mid;
            if(sq==x)
            {
                result=true;
                break;
            }
            else if(sq>x)
            {
                ub=mid-1;
            }
            else{
                lb=mid+1;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.println(perfect_Square(num));
        sc.close();
        
    }
}
