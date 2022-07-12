package PracticeProjects.AlphabetSortings;

import java.util.Scanner;

//write a program to cheq it is panagram or not
public class Panagram {
    static boolean panagram(String a) {
        if (a.length() < 26) {
            return false;
        } else {
            for (char i = 'a'; i <= 'z'; i++) {
                if (a.indexOf(i) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(panagram(s.toLowerCase()));
    }
}
