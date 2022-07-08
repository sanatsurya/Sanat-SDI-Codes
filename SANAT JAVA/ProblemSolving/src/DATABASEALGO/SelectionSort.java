package DATABASEALGO;

public class SelectionSort {
    public static void SelectionSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int index= i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[index]){
                    index=j;//Search for lowest index
                }
            }
            int smallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNumber;
        }

    }
    public static void main(String[] args) {
        int [] arr1= {7,8,5,4,1,3,9,15,12};
        System.out.println("Before Selection Sort");
        for (int i: arr1){
            System.out.print(i+ " ");
        }
        System.out.println();
        SelectionSort(arr1);//Sorting using selection sort
        System.out.println("After Selection Sort");
        for (int i: arr1){
            System.out.print(i+" ");
        }
    }
}
