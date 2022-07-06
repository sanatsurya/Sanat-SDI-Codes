package Assignment17_05_2022;

import java.util.Map;
import java.util.TreeMap;

//Write a java program to implement methods of treemap
public class Assignment03 {
    public static void main(String[] args) {
        TreeMap<String, String> t1 = new TreeMap<>();
        t1.put("name","Sanat");
        t1.put("city","Astaranga");
        t1.put("email","mymail@email.com");
        System.out.println("********To print Treemap**********");
        for(Map.Entry m:t1.entrySet()){
            System.out.println(m);
        }
        System.out.println("This element will remove next"+t1.get(t1));

        System.out.println("the value of key city :"+ t1.get("city") );
        System.out.println();

    }
}
