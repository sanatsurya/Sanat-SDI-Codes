package PracticeProjects.Calculator;

import java.util.Scanner;

interface Calculator{
    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    double div(int num1, int num2);
}
class Calculaton implements Calculator{

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int mul(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public double div(int num1, int num2) {
        return (double) num1/num2;
    }
}
public class CalculatorUsingArithmatic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input number one: ");
        int one = sc.nextInt();
        System.out.print("Input number two: ");
        int two = sc.nextInt();
        Calculaton cal = new Calculaton();
        System.out.println("Addition of two number is " +cal.add(one,two));
        System.out.println("Substraction of two number is " + cal.sub(one,two));
        System.out.println("Multiplication of two number is " + cal.mul(one,two));
        System.out.println("Division of two number is " + cal.div(one,two));
    }
}
