package JavaBasics.Recursion;

import java.util.Scanner;

public class PowerofNumbers {
    static int Power(int num, int pow){
        if(pow==0){
            return num;
        }
        return num*Power(num,pow-1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the number");
        int number = sc.nextInt();
        System.out.print("Insert the power");
        int power = sc.nextInt();
        System.out.println(Power(number,power));
    }
}
