package PracticeProjects.ArraysReleated;

import java.util.Arrays;
//Wap to store some value in an array and find the minimum value
public class MinimumValueInArray {
    public static void main(String[] args) {
        int arr[]={5,7,8,4,2,3,5};
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];


            }

        }
        System.out.println(min);
    }
}
