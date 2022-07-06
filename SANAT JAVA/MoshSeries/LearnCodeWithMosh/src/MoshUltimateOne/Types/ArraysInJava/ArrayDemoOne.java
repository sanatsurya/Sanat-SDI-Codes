package MoshUltimateOne.Types.ArraysInJava;

import java.util.Arrays;

public class ArrayDemoOne {
    public static void main(String[] args) {
        int [] number = new int[10];
        number[0]=1;
        number[2]=4;
        System.out.println(Arrays.toString(number));
//        for (int i = 0; i < number.length; i++) {
//            System.out.print(" "+i);
//        }
        int n1[] = {5,2,8,6,7,9};
        System.out.println(n1.length);
        Arrays.sort(n1);
        System.out.println(Arrays.toString(n1));

    }
}
