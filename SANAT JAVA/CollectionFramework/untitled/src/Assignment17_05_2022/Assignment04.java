package Assignment17_05_2022;

import java.util.LinkedHashMap;
import java.util.Map;
// Write a java program to insert and display the elements inside the linked hashmap.
public class Assignment04 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> l1 = new LinkedHashMap<>();
        l1.put(11,"Amrit");
        l1.put(5,"sandip");
        l1.put(9,"jata");
        l1.put(18,"mytra");
        l1.put(24,"adarsha");

        for(Map.Entry m: l1.entrySet()){
            System.out.println(m);
        }
        System.out.println(l1.keySet());
        System.out.println(l1.containsKey(18));
    }
}
