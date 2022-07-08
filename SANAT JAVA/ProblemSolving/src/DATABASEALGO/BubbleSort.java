package DATABASEALGO;

public class BubbleSort {
    public static void main(String [] args){
        int array[] = {60,75,80,89,86,84,97,48,57,53,74};
        int temp =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i]= array[j];
                    array[j]= temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
    }
}
