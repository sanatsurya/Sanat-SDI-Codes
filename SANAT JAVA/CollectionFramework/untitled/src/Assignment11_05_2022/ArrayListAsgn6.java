package Assignment11_05_2022;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to reverse elements in an array list
public class ArrayListAsgn6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr6= new ArrayList<>();
        arr6.add(1);
        arr6.add(2);
        arr6.add(3);
        arr6.add(4);
        arr6.add(5);
        arr6.add(6);
        arr6.add(7);
        arr6.add(8);
        arr6.add(9);
        System.out.println("Before Reverse "+arr6);
        Collections.reverse(arr6);//This will reverse the hole array
        System.out.println("After Reverse "+ arr6);
    }
}
