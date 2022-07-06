package WeeklyAssignments.Assignment25_06_2022;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Line: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            switch (name.charAt(i)){
                case ' ':
                    count++;
            }
        }
        System.out.println("The string contains "+count+" Space ");

    }
}
