package WeeklyAssignments.Assignment25_06_2022;
//left triangle pattern
public class Assignment5 {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1;i<=row;i++) {
            for(int j=0;j<row-i;j++) {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
