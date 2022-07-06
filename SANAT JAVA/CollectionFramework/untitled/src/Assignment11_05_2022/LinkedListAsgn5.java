package Assignment11_05_2022;

import java.util.Collections;
import java.util.LinkedList;

//Write a Java program to clone a linked list to another linked list
public class LinkedListAsgn5 {
    public static void main(String[] sanat){
        LinkedList<Integer> ll5 = new LinkedList<>();
        ll5.add(1);
        ll5.add(2);
        ll5.add(3);
        ll5.add(4);
        ll5.add(5);
        ll5.add(6);
        ll5.add(7);
        System.out.println("List 1 " + ll5);
        LinkedList<Integer> ll6 = new LinkedList<>();
        ll6.add(15);
        ll6.add(17);
        ll6.add(19);
        ll6.add(32);
        ll6.add(87);
        System.out.println("List 2 " + ll6);
        ll6.addAll(ll5);
        System.out.println("After clone list1 to list2 " + ll6);
    }
}
