package Assignment11_05_2022;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to append the specified element to the end of a hash set and iterate through all elements in a hash list
public class HashSetAsgn1 {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        hs.add(9);
        hs.add(10);
        hs.add(11);
        hs.add(12);
        System.out.println(hs);
        Iterator<Integer> itr1 = hs.iterator();
        while (itr1.hasNext()){
            System.out.println("Current element is "+ itr1.next());
        }
    }
}
