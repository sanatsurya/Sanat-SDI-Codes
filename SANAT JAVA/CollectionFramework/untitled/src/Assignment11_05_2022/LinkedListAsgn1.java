package Assignment11_05_2022;
//Write a Java program to append the specified element to the end of a linked list and iterate it in reverse order
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAsgn1 {
    public static void main(String[] args) {
        LinkedList <Integer> ll1 = new LinkedList<>();
        ll1.add(4);
        ll1.add(8);
        ll1.add(12);
        ll1.add(16);
        ll1.add(20);
        ll1.add(24);
        ll1.add(28);
        System.out.println("Before"+ll1);
        Collections.reverse(ll1);
        //System.out.println("After reverse" + ll1);
        Iterator<Integer> itr1= ll1.iterator();
        while (itr1.hasNext()){
            System.out.print(" "+ itr1.next());
            System.out.print(" ");
        }

     }
}
