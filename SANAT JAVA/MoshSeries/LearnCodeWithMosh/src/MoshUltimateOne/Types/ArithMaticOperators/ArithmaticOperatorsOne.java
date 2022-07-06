package MoshUltimateOne.Types.ArithMaticOperators;

import java.util.Scanner;
interface Calculation{
    int sum(int x, int y);
    int sub(int x, int y);
    int mul(int x, int y);
    double div(int x, int y);
    int increment(int x);
    int augmentation(int x);
}
class Calculator implements Calculation{

    @Override
    public int sum(int x, int y) {
        return x+y;
    }

    @Override
    public int sub(int x, int y) {
        return x-y;
    }

    @Override
    public int mul(int x, int y) {
        return x*y;
    }

    @Override
    public double div(int x, int y) {
        double result = (double)x/(double) y;
        return result;
    }

    @Override
    public int increment(int x) {
        return x++;
    }

    @Override
    public int augmentation(int x) {
        return x+=2;
    }
}
public class ArithmaticOperatorsOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Your First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Input Your Second Number: ");
        int num2 = sc.nextInt();
        Calculator cr = new Calculator();
        System.out.println("addition is " + cr.sum(num1,num2));
        System.out.println("subtraction is" + cr.sub(num1,num2));
        System.out.println("Multiplication is " + cr.mul(num1,num2));
        System.out.println("Division is " + cr.div(num1,num2));
        System.out.println(cr.increment(++num1)+" and " + ++num2);
        System.out.println("#########Augmentation#################");
        System.out.println(cr.augmentation(num1));
    }
}
