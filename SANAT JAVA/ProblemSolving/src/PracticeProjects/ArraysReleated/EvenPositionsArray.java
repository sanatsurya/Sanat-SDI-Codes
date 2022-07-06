package PracticeProjects.ArraysReleated;
//Write a program to print the even position in an array
public class EvenPositionsArray {
    public static void main(String[] args) {
        int arr[]= {2,4,5,6,7,8,9,10};
        for (int i = 1; i < arr.length; i++) {
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
