package Assignment11_05_2022;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to insert an element into the array list at the first position
public class ArrayListAsgn5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr5 = new ArrayList<>();
        arr5.add(1);
        arr5.add(2);
        arr5.add(3);
        arr5.add(4);
        arr5.add(5);
        arr5.add(6);
        arr5.add(7);
        arr5.add(8);
        arr5.add(9);
        arr5.add(10);
        arr5.add(11);
        System.out.println(arr5);
        arr5.add(0,55);
        System.out.println("print1 :"+ arr5);
        arr5.add(0,88);
        System.out.println("print2 :"+ arr5);
        System.out.println(arr5);

    }
}
