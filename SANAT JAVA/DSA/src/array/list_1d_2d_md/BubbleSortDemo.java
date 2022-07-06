package array.list_1d_2d_md;

class Buffer{
	static void swap(int ar[],int y) {
		int temp = 0;
		temp = ar[y];
		ar[y+1]= temp;
	}
}
public class BubbleSortDemo {
	public static void main(String [] args) {
		int[] arr = {5,8,9,11};
		int last = arr.length -1;
		for (int i = 0 ; i< arr.length; i++) {
			for(int j = 0; j<= last-1; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j);
				}
			}
		}
		for(int i : arr)
			System.out.println(i + "");
	}

	static void swap(int ar[],int y) {
		int temp = 0;
		temp = ar[y];
		ar[y+1]= temp;
	}

}
