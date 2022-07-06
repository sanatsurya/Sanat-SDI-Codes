package Assignment11_05_2022;
//Write a Java program of swap two elements in a linked list
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListAsgn4 {
    public static void main(String []arr){
        LinkedList<Integer> ll4 = new LinkedList<>();
        ll4.add(4);
        ll4.add(5);
        ll4.add(6);
        ll4.add(7);
        ll4.add(8);
        ll4.add(9);
        System.out.println("The value of linked list is " + ll4);
        Collections.swap(ll4,0,1);
        System.out.println("After swap the value of index 0 and 1 is"+ll4);
    }
}
