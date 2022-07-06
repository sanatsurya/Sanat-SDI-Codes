package OnlineClassProblemSolving;

import java.util.Arrays;

public class SortingNumbers {
    public static void main(String[] args) {
        int arr []={0,0,1,2,1,2,1,0,1,0};
//        Arrays.sort(arr);
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
