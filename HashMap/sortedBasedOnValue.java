import java.util.*;
public class sortedBasedOnValue {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of key-value pair: ");
        int n=sc.nextInt();
        TreeMap<String,Integer> map=new TreeMap<>();
        System.out.println("Enter the key and value");
        for(int i=0;i<n;i++)
        {
            int key=sc.nextInt();
            String value=sc.next();
            map.put(value,key);

        }
        System.out.println("Map is "+map);
        sc.close();
    }
}
