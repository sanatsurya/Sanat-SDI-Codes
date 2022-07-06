package Assignment11_05_2022;

import java.util.ArrayList;

//Write a Java program to update specific array element by given element
public class ArrayListAsgn4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.add(4);
        arr4.add(5);
        arr4.add(9);
        arr4.add(11);
        arr4.add(12);
        arr4.add(17);
        arr4.add(18);
        arr4.add(19);
        arr4.add(22);
        System.out.println(arr4);
        arr4.set(3,18);//This will replace element at index 3 by 18
        arr4.set(4,1800);//This will replace element at index 3 by 18
        arr4.set(5,1578);//This will replace element at index 3 by 18
        arr4.set(6,1875);//This will replace element at index 3 by 18
        System.out.println(arr4);
    }
}
