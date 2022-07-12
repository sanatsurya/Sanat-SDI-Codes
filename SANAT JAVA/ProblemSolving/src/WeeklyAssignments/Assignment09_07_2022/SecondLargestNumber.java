package WeeklyAssignments.Assignment09_07_2022;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr ={5,7,8,9,10,14,15,17,19};
        Arrays.sort(arr);
        System.out.println("Second largest "+ arr[arr.length-2]);
    }
}
