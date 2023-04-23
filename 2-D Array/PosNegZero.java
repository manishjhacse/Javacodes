import java.util.*;
public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row and colums:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int pos=0,neg=0,even=0,odd=0,zero=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]>0)
                {
                    pos++;
                }
                else if(arr[i][j]<0){
                    neg++;
                }
                else
                {
                    zero++;
                }
                if(arr[i][j]%2==0)
                {
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("Number of Positive numbers: "+pos);
        System.out.println("Number of negative numbers: "+neg);
        System.out.println("Number of odd numbers: "+odd);
        System.out.println("Number of even numbers: "+even);
        System.out.println("Number of 0: "+zero);
        sc.close();
    }
    
    
}
