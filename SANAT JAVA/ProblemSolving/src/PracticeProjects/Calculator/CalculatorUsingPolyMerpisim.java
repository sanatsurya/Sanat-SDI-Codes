package PracticeProjects.Calculator;

import java.util.Scanner;

public class CalculatorUsingPolyMerpisim {
    static class Calculations{
        public void display(int num1, int num2, char ch){
            System.out.println(num1+num2);
        }
        public void display(byte num1, int num2, char ch){
            System.out.println(num1- num2);
        }
        public void display(float num1, float num2, char ch){
            System.out.println(num1*num2);
        }
        public void display(double num1, double num2, char ch){
            System.out.println(num1/num2);
        }
    }
    public static void main(String[] args) {
        Calculations cal = new Calculations();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number one: ");
        int one = sc.nextInt();
        System.out.println("Enter Number two: ");
        int two = sc.nextInt();
        System.out.println("Enter char");
        char ch = sc.next().charAt(0);
        cal.display((float) one,(float) two,  ch);
    }
}
