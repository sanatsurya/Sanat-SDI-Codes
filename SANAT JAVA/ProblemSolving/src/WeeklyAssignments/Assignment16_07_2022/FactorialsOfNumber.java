package WeeklyAssignments.Assignment16_07_2022;

import java.util.Scanner;
//
public class FactorialsOfNumber {
    //This is using recursive approach
    static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }

        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert A number: ");
        int number = sc.nextInt();
        System.out.println("Factorial of number is: "+factorial(number));
    }
}
