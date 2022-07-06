package PracticeProjects.RepeatingAndNonRepeating;

import java.util.Scanner;
//Write a program to to accept a string and accept a character remove the given character in a string and display it?
public class RemoveGivenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String name = sc.nextLine();
        System.out.println("Input character to remove: ");
        char ch = sc.next().charAt(0);
//        StringBuilder removech = new StringBuilder(name);
//        for (int i = 0; i < name.length(); i++) {
//            if(ch==name.charAt(i)){
//                removech.deleteCharAt(i);
//            }
//        }
//        System.out.println(removech);
        for (int i = 0; i < name.length(); i++) {
            if(ch== name.charAt(i)){
                continue;
            }
            System.out.print(name.charAt(i));
        }
    }
}
