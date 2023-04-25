import java.util.*;
public class squareRoot {
    public static int findSquareRoot(int num)
    {
        int low=0,high=num,res=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==num)
            {
                //perfect square root 
                return mid;
            }
            else if(val<num)
            {
                //store the floor value so in case number is not perfect square we can return floor value
                res=mid;
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of which you want the square root: ");
        int num=sc.nextInt();
        int result=findSquareRoot(num);
        System.out.println("Square root of the given number is: "+result);
        sc.close();
    }
}
