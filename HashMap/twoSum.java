import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int result[]=new int[2];
        Arrays.fill(result, -1);
        System.out.println("enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i], i);
        }
        for(int i=0;i<n;i++)
        {
            
            int rem=target-arr[i];
            if(arr[i]==target&& map.containsKey(0))
            {
                result[0]=i;
                result[1]=map.get(0);
                break;
            }
            else if(map.containsKey(rem))
            {
                if(map.get(rem)>i)
                {
                    result[0]=i;
                    result[1]=map.get(rem);
                }
            }
        }
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
