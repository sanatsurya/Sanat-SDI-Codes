package WeeklyAssignments.Assignment25_06_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Insert elements at specific position in array
public class Assignment2 {

    public static void main(String[] args) {
        List<Integer> arrays = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrays.add(i);
        }
        System.out.println(arrays);
        arrays.add(2,20);
        System.out.println(arrays);


    }
}
