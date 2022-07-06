package PracticeProjects.SwappingNumber;

import java.util.Scanner;
//Write a programme to accept two numbers and swap it
public class SwapNumberEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Insert Second Number: ");
        int num2 = sc.nextInt();
        int temp = 0;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Reverse number is");
        System.out.println(num1);
        System.out.println(num2);

    }
}
