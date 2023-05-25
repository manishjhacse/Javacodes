import java.util.*;

public class typesOfMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Siddhesh");
        map.put(1, "Manish");
        map.put(2, "Rohit");
        map.put(6, "Rahul");
        map.put(10, "Anshuman");
        map.put(9, "Lucky");
        System.out.println("Hashmap is: " + map);

        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(3, "Siddhesh");
        map1.put(1, "Manish");
        map1.put(2, "Rohit");
        map1.put(6, "Rahul");
        map1.put(10, "Anshuman");
        map1.put(9, "Lucky");
        System.out.println("Linked Hashmap is: " + map1);

        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(3, "Siddhesh");
        map2.put(1, "Manish");
        map2.put(2, "Rohit");
        map2.put(6, "Rahul");
        map2.put(10, "Anshuman");
        map2.put(9, "Lucky");
        System.out.println("TreeMap is: " + map2);
    }
}
