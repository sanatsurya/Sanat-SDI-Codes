package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        System.out.println("l1's value"+l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(80);
        l2.add(90);
        l2.add(100);
        l2.add(110);
        l2.add(120);
        System.out.println("values of l2"+l2);
        l2.addAll(l1);
        System.out.println("L2's Value with l1 is"+l2);
        l1.retainAll(l2);//IT Puts impacts on l2
        System.out.println("After retain l1"+ l1);
        l2.retainAll(l1);
        System.out.println("After retain l2"+l2);
        ArrayList<Integer> l3 = new ArrayList<>();
        System.out.println("l3"+ l3);
        Collections.addAll(l3, 55,58,56,57);
        System.out.println("The print after add all"+l1);
        System.out.println("The print after add all"+l2);
        System.out.println("The print after add all"+l3);
        boolean contains62 = l1.contains(62);
        System.out.println(contains62);
        boolean contains60 = l1.contains(60);
        System.out.println(contains60);
        boolean contains2 = l1.contains(l2);
        System.out.println("Does first list contains "+contains2);
    }
}
