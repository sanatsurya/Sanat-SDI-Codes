package Assignment12_05_2022;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortingInteger {
    public static void main(String[] args) {
        List<Integer> List1= new ArrayList<>();
        List1.add(5);
        List1.add(20);
        List1.add(35);
        List1.add(24);
        List1.add(87);
        List1.add(99);
        List1.add(78);
        List1.add(69);
        System.out.println(List1);
        Collections.sort(List1);
        System.out.println("After short********");
        System.out.println(List1);

    }
}
