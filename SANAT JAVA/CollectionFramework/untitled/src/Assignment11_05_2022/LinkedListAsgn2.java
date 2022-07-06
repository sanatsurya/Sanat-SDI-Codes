package Assignment11_05_2022;

import java.util.LinkedList;

//Write a Java program to display the elements and their positions in a linked list
public class LinkedListAsgn2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        ll2.add(40);
        ll2.add(50);
        ll2.add(60);
        System.out.println(ll2);
        for (int i = 0; i < ll2.size(); i++) {
            System.out.println("Index at " + i +" Element is  "+ ll2.get(i));
        }
    }
}
