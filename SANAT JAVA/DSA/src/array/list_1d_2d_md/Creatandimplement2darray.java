package array.list_1d_2d_md;

public class Creatandimplement2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d3[][] = new int[3][4];
		int count = 1;
		for (int i = 0; i < d3.length; i++) {
			for (int j = 0; j < d3[i].length; j++) {
				d3[i][j] = count;
				count++;
			}
		}
		for (int i = 0; i < d3.length; i++) {
			for (int j = 0; j < d3[i].length; j++) {
				System.out.print(d3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
