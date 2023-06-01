import java.util.*;
public class sortedBasedOnKey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of key-value pair: ");
        int n=sc.nextInt();
        TreeMap<Integer,String> map=new TreeMap<>();
        System.out.println("Enter the key and value");
        for(int i=0;i<n;i++)
        {
            int key=sc.nextInt();
            String value=sc.next();
            map.put(key,value);

        }
        System.out.println("Map is "+map);
        sc.close();
    }
}
