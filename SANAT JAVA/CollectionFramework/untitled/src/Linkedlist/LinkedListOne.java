package Linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListOne {
    public static void main(String []a){
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(1);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(5);
        ll1.add(6);
        ll1.add(7);
        System.out.println(ll1);
        ll1.remove(2);
        System.out.println(ll1);
        Collections.sort(ll1);
        System.out.println(ll1);
        ll1.add(1,50);
        LinkedList<String> firstList = new LinkedList<String>();
        firstList.add("Satya");
        firstList.add("Ratnalu");
        firstList.add("Aparna");
        firstList.add("Biswa");
        firstList.add("Sanat");
        firstList.add("Satya");
        firstList.addLast("jyouti");
        System.out.println(firstList);
        firstList.addFirst("biswa");
        System.out.println(firstList);
    }
}
