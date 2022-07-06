package PracticeProjects.StringReleated.CharacterReleaed;

import java.util.Scanner;
//Wap to insert a string and a character and find the occurrence of the character
public class OcuuranceOfgivenChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a line: ");
        String name = sc.nextLine();
        System.out.println("Input a character to find it's occurrence");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < name.length(); i++) {
            if (ch == name.charAt(i)){
                System.out.println("The word "+ch+" is at "+ i+"Index");
            }
        }

    }
}
