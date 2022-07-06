package PracticeProjects.HalfPyramid;

public class DiamondPyramid {
    public static void main(String[] args) {
        int row=5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2*row-1; j++) {
                System.out.println(" ");
            }
            for (int j = i; j < row; j++) {
                System.out.println("*");
            }
        }
    }
}
