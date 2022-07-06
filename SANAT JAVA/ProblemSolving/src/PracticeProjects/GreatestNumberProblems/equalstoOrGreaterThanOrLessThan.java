package PracticeProjects.GreatestNumberProblems;

import java.util.Scanner;
public class equalstoOrGreaterThanOrLessThan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("greater number Is  " +num1);
        } else if (num1==num2) {
            System.out.println("Both are equal");
        } else {
            System.out.println(num2+ "num2 is greater");
        }
    }
}
