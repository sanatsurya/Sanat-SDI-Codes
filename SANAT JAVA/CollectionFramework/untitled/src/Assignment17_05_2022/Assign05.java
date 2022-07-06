package Assignment17_05_2022;

import java.util.ArrayList;
import java.util.Collections;

//Write a java program to implement bubble sort on an arraylist of integer values
public class Assign05 {
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>();
        a1.add(27);
        a1.add(37);
        a1.add(42);
        a1.add(22);
        a1.add(45);
        a1.add(77);
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);
    }
}
