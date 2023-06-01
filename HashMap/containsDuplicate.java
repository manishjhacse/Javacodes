import java.util.*;
public class containsDuplicate {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,1};
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean res=false;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                res=true;
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println("arrays contains a dublicate element: "+res);
    }
}
