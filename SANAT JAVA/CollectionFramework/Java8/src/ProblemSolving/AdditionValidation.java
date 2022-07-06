package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditionValidation {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,7,8,2,9,4,5,6,10,15,18);
        int arr[] = new int[]{1,7,8,2,9,4,5,6,10,15,18};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+arr[j]==18){
                    System.out.println("The number " + arr[i]+" and "+arr[j]+" is make a sum 18 ");
                }
            }
        }
    }
}
