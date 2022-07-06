package PracticeProjects.VowelsOrNotVowels;

import java.util.Scanner;

public class VowelCheqUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter a character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("This is a vowel");
                break;
            default:
                System.out.println("This is not a vowel");
        }
    }
}
