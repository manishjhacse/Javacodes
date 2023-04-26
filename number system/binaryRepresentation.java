import java.util.*;
public class binaryRepresentation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int arr[]=new int[50];
       int i=0;
       while(num>0)
       {
           arr[i]=num%2;
            num=num/2;
            i++;

       }
       i--;
       while(i>=0)
       {
        System.out.print(arr[i]);
        i--;
       }
       sc.close();

    }   
}
