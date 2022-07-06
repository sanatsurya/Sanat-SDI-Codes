package WeeklyAssignments.Assignment18_06_2022;

import java.util.Scanner;
//Wap to accept two number and check it out first number is divisible by second number
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();
        if(num1%num2==0){
            System.out.println("First number is divisible by second number");
        }
        else {
            System.out.println("First number is not divisible by second number");
        }
    }
}
