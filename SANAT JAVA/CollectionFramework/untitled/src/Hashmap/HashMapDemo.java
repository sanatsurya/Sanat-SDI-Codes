package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Name","Identity");
        map1.put("City","Bhubaneswar");
        map1.put("phone","904000");
        map1.put("email","mymail@email.com");
        System.out.println(map1);
        System.out.println(map1.get("City"));
        Map<String, String>map2= new HashMap<>();
        map2.putAll(map1);
        System.out.println(map2);
    }
}
