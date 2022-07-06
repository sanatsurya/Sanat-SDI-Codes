package WeeklyAssignments.Assignment25_06_2022;
//Diamondshape Pattern
public class Assignment6 {
    public static void main(String[] args) {
        int row = 4;
//upper half
        for(int i=1;i<=row;i++) {
//spaces
            for(int j=1;j<=row-i;j++) {
                System.out.print(" "+" ");
            }
//for stars
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
//Lower Half
        int row1 = row-1;
        for(int i=row1;i>=1;i--) {
//spaces
            for(int j=1;j<=row-i;j++) {
                System.out.print(" "+" ");
            }
//for stars
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }
}
