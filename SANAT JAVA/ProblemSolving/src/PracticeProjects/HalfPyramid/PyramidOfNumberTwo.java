package PracticeProjects.HalfPyramid;
//1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
public class PyramidOfNumberTwo {
    public static void main(String[] args) {
        int row = 7;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
