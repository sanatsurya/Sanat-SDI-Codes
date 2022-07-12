package PracticeProjects.StringReleated;

import java.util.Scanner;

public class FirstLetterOfEachString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = scanner.nextLine();
        System.out.print(str.charAt(0));
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==' '){
                System.out.print(" "+str.charAt(i+1));
            }
        }
    }
}
