package PracticeProjects.AlphabetSortings;

import java.util.Scanner;

public class DisplayAcceptCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='@'||name.charAt(i)=='$'||name.charAt(i)=='&'){
                System.out.println(name.charAt(i));
            }
        }
    }
}
