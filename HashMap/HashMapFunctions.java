import java.util.*;     
public class HashMapFunctions {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap=new HashMap<>();
        //put function
        hashmap.put(1,"Manish");
        hashmap.put(4,"Rahul");
        hashmap.put(9,"Rohit");
        System.out.println("The hashmap  is "+hashmap);
        //get function
        String res=hashmap.get(9);
        System.out.println("value for the given key is: "+res);
        //containsKey function
        System.out.println(hashmap.containsKey(4));
        System.out.println(hashmap.containsKey(3));

        //remove function
        hashmap.remove(4);
        System.out.println("Updated hashmap is: "+hashmap);

        hashmap.put(4, "Rahul");

        //iteratig using the for loop
        System.out.println("iterating using for loop");
        for(Map.Entry<Integer,String>e:hashmap.entrySet())
        {
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
