package PracticeProjects.StringReleated.PermutationOfString;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            for (int j = 1; j < line.length(); j++) {
                System.out.print(line.charAt(i)+" "+ line.charAt(j));
            }
            System.out.print(line.charAt(i));
        }
    }
}
