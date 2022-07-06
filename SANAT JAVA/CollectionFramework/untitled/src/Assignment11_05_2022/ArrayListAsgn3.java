package Assignment11_05_2022;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list
public class ArrayListAsgn3 {
    public static void main(String[] args) {
        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("Satya");
        arr3.add("Amit");
        arr3.add("Biswa");
        arr3.add("Bishtnu");
        arr3.add("Biswajit");
        arr3.add("Batula");
        arr3.add("Sachidanand");
        arr3.add("Sachin");
        arr3.add("Amit");
        arr3.add("Pinaki");
        System.out.println(arr3.get(4));//This is to retrieve an element at specific index
        System.out.println(arr3.get(0));//This is to retrieve an element at specific index
        System.out.println(arr3.get(5));//This is to retrieve an element at specific index
        System.out.println(arr3.get(8));//This is to retrieve an element at specific index
    }
}
