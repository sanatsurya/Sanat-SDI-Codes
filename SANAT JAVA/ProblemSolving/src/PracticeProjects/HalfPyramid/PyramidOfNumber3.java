package PracticeProjects.HalfPyramid;

public class PyramidOfNumber3 {
    public static void main(String[] args) {
        int row = 7;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
