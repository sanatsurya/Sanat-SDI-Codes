package PracticeProjects.VoterChq;

import java.util.Scanner;

public class VoterOrNot {
    public static void main(String[] args) {
        System.out.println("Input the age of a person");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("This is eligible for vote and his age is " + age );
        } else if (age <= 5) {
            System.out.println("You are a Kid what you think you can vote your age is just " +age);
        } else {
            System.out.println("This person is not eligible for vote and his age is " +age);
        }

    }
}
