package WeeklyAssignments.Assignment18_06_2022;
//wap to display reverse star patterns
public class Assignment5 {
    public static void main(String[] args) {
       int row = 5;
        for (int i = row; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
