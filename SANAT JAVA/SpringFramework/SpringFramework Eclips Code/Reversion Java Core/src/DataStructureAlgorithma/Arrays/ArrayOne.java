package DataStructureAlgorithma.Arrays;



public class ArrayOne {
	public static void main(String []arr) {
		int a1[] = new int[8];
		int count = 1;
		for(int i=0; i<a1.length;i++) {
			a1[i]=count;
			count++;
		}
		System.out.println("To execute the value of array is");
		for(int j=0; j<a1.length; j++) {
			System.out.print(a1[j]+" ");
		}
	}

}
