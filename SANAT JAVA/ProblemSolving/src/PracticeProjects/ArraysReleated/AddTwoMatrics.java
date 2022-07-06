package PracticeProjects.ArraysReleated;
//wap to add elements of two matic
public class AddTwoMatrics {
    public static void main(String[] args) {
        int a[][]={{4, 5, 6},{10,11,12},{22,23,24}};
        int b[][]={{14,15,16},{18,19,20},{27,28,29}};
        int c[][]= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
