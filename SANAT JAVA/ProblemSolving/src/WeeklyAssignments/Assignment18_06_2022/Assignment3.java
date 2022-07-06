package WeeklyAssignments.Assignment18_06_2022;

import java.util.Scanner;
//wap to accept a name and display it's vertically order?
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a name: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
