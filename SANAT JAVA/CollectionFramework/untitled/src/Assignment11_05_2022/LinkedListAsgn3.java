package Assignment11_05_2022;
import java.util.LinkedList;
//Write a Java program to retrieve an element (at a specified index) from a given array list
public class LinkedListAsgn3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll3 = new LinkedList<>();
        ll3.add(5);
        ll3.add(6);
        ll3.add(7);
        ll3.add(8);
        ll3.add(9);
        ll3.add(10);
        ll3.add(0,5);
        for (int i = 0; i < ll3.size(); i++) {
            System.out.println(" In " + i +" Index value is " + ll3.get(i));
        }
    }
}
