package PracticeProjects.GreatestNumberProblems;

import java.util.Scanner;

// Write a programme to input 3 numbers and display the greatest one
public class GreatestNumber {
    public static void main(String[] args) {
        System.out.println("Input 3 numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1>num2  && num1>num3){
            System.out.println("Greatest number is " + num1);

        } else if (num2>num3){
            System.out.println("Greatest number is " + num2);

        } else  {
            System.out.println("Greatest number is " + num3);
        }

    }
}
