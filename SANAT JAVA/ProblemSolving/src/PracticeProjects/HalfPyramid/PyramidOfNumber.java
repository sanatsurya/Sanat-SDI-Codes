package PracticeProjects.HalfPyramid;

public class PyramidOfNumber {
    public static void main(String[] args) {
        int num=1;
        int row=5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
