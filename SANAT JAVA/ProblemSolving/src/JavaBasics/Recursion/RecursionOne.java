package JavaBasics.Recursion;

import java.util.Scanner;

public class RecursionOne {
    static void display(String name, int time){
        if (time==0){
            return;
        }
        System.out.println(name);
        display(name , --time);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input what you want to enter: ");
        String name = sc.nextLine();
        System.out.print("Input how many times you: ");
        int times = sc.nextInt();
        display(name,times);
    }
}
