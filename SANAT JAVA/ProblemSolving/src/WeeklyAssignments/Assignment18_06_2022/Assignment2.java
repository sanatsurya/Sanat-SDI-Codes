package WeeklyAssignments.Assignment18_06_2022;

import java.util.Scanner;
//Wap to accept a number and display the number is odd number or not?
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert a number: ");
        int num = sc.nextInt();
        if(num%2!=0){
            System.out.println("The number is odd number");
        }
        else {
            System.out.println("The number is not odd number");
        }
    }
}
