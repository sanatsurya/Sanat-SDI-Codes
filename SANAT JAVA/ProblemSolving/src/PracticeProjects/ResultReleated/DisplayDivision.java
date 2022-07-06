package PracticeProjects.ResultReleated;

import java.util.Scanner;

public class DisplayDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert mark: ");
        int mark1 = sc.nextInt();
        System.out.print("Insert mark: ");
        int mark2 = sc.nextInt();
        System.out.print("Insert mark: ");
        int mark3 = sc.nextInt();
        int result = mark1+mark2+mark3;
        System.out.println("The total mark of 3 subject is " + result);
        if(result>=250){
            System.out.println("Congrats you have first division");
        } else if (result>=200&&result<250) {
            System.out.println("Congrats you have second division");
        } else if (result>=170&& result<200) {
            System.out.println("You have third division");
        }else {
            System.out.println("Oops you are failed");
        }

    }
}
