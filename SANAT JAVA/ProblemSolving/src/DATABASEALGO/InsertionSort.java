package DATABASEALGO;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key= arr[j];
            int i = j-1;
            while ((i>-1)&&(arr[i]>key)){
                arr[i+1]= arr[i];
                i--;
            }
            arr[i+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr1[]= {9,4,2,5,7,6,10,27,11};
        System.out.println("Before Bubble Sort");
        for (int i : arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        insertionSort(arr1);
        for (int i: arr1){
            System.out.print(i +" ");
        }
    }
}
