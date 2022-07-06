package PracticeProjects.NumberReleted.accending;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class AccendingNumber {
    public static void main(String[] args) {
        int arr[] ={16,17,14,13,12,11,10,15};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        //*************Using shorting technic********************
//        int temp = 0;
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i]<arr[j]){
//                    temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print( arr[i]+ " ");
//        }
        //*************************Sorting using Stream method******************************************
//        System.out.println();
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
