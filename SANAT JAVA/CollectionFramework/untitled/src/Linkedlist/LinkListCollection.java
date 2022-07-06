package Linkedlist;

import java.util.LinkedList;
import java.util.List;
/* Linked lists structures are as similar as    */
public class LinkListCollection {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);
        System.out.println(ll);
        ll.remove(2);
        ll.clear();
        System.out.println(ll.isEmpty());
    }
}
