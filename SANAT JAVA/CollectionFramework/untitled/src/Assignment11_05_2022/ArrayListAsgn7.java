package Assignment11_05_2022;

import java.util.ArrayList;

//Write a Java program to print all the elements of a ArrayList using the position of the elements
public class ArrayListAsgn7 {
    public static void main(String[] args){
        ArrayList<Double> arr7= new ArrayList<>();
        arr7.add(1.58);
        arr7.add(2.58);
        arr7.add(3.58);
        arr7.add(4.58);
        arr7.add(5.58);
        arr7.add(6.58);
        arr7.add(7.58);
        System.out.println(arr7);
        System.out.println(arr7.get(1));//This print the value of specific index
        System.out.println(arr7.get(2));//This print the value of specific index
        System.out.println(arr7.get(3));//This print the value of specific index
        System.out.println(arr7.get(4));//This print the value of specific index
        System.out.println(arr7.get(5));//This print the value of specific index
        System.out.println(arr7.get(6));//This print the value of specific index
    }
}
