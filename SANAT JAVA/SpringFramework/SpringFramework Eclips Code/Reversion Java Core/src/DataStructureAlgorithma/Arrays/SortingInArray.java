package DataStructureAlgorithma.Arrays;

import java.util.Arrays;

public class SortingInArray {
	public static int Search(int array[], int key) {
		for(int i=0; i<array.length;i++) {
			if(array[i]==key) {
				return i;
			}
		}
		return -1;

	}
	public static void main(String[] args) {
		int arr[]= {4,2,1,5,6,7,8,9};
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		int indexvalue = Search(arr,9);
		if(indexvalue==-1)
			System.out.println("The element is fount ");
		else
			System.out.println("Element is ar " + indexvalue);
	}

}
