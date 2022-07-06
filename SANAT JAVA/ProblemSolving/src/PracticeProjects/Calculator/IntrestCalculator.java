package PracticeProjects.Calculator;

import java.util.Scanner;

public class IntrestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Money you want to borrow: ");
        int money = sc.nextInt();
        System.out.println("Input How many year do you want to hold the money: ");
        int Year = sc.nextInt();
        System.out.println("Input the Rate of Interest: ");
        int interest_rate = sc.nextInt();
    }
}
