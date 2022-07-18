package WeeklyAssignments.Assignments18_07_2022;

import java.util.Arrays;

public class BinarySearchUsingRecursion {
    static int BinarySearch(int arr[],int search){
        Arrays.sort(arr);
        int first= arr[0];
        int last= arr.length-1;
        while (last>first){
            int mid = (first+last)/2;
            if(arr[mid]==search){
                return arr[mid];
            } else if (search>arr[mid]) {
                for (int i = mid; i < last; i++) {
                    if (arr[i]==search){
                        return i;
                    }
                }
            } else if (search<arr[mid]) {
                for (int i = 0; i < mid; i++) {
                    if (arr[i]==search){
                        return i;
                    }
                }
            }else {
                System.out.println("The value is not available");
            }
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arrays[]={5,7,8,9,1,0,17,18,75};
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        System.out.println(BinarySearch(arrays,9));
    }

}
