package WeeklyAssignments.Assignment25_06_2022;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            count++;
        }
        System.out.println("The number of words in string is : "+ count);
    }
}
