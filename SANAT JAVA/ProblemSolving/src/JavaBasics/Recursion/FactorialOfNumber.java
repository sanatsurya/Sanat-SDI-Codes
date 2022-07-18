package JavaBasics.Recursion;

import java.util.Scanner;

public class FactorialOfNumber {
    static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }
        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Program to Get Factorial Of the Numbers");
        System.out.println();
        System.out.print("Input number: ");
        int number= sc.nextInt();
        System.out.println("Factorial of "+number+" is: "+factorial(number));

    }
}
