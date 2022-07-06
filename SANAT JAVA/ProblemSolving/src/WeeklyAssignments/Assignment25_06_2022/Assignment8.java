package WeeklyAssignments.Assignment25_06_2022;

import java.util.Scanner;

//Write a java programme to find whether the number is prime or not
public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Number: ");
        int num = sc.nextInt();
        boolean isPrime = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (!isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }
}
