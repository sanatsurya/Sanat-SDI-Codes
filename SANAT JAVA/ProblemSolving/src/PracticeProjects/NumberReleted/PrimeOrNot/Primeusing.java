package PracticeProjects.NumberReleted.PrimeOrNot;

import java.util.Scanner;

public class Primeusing {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println(num+ " is Not prime number" );
        }else {
            System.out.println("Prime number");
        }
    }
}
