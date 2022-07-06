package PracticeProjects.RepeatingAndNonRepeating.RepeatingCharacter;

import java.util.Scanner;

public class DisplayNoOfRepeatation {
    public static void main(String[] args) {
        int repeatation = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String name = sc.nextLine();
        System.out.print("Enter a character to cheque the reputation: ");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==ch){
                repeatation++;
            }
        }
        System.out.println("The character repeated is: "+ repeatation);
    }
}
