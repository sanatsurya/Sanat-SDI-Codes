package PracticeProjects.StringReleated.Concadination;

import java.util.Scanner;
//WAP TO CONCADE TWO STRINGS
public class ToStringConcadinateDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input line one: ");
        String lineOne = sc.nextLine();
        System.out.print("Input line Two: ");
        String lineTwo = sc.nextLine();
        System.out.print("Concatenated line is "+ lineOne+" "+lineTwo);
    }
}
