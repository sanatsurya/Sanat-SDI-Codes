package PracticeProjects.WeekCheq;

import java.util.Scanner;

//Write a programme and display corresponding day
public class DisplayDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        switch (date){
                case 1:
                System.out.println("This is Monday");
                break;
                case 2:
                System.out.println("This is tues day");
                break;
                case 3:
                System.out.println("This is wednesday");
                break;
                case 4:
                System.out.println("This is thursday");
                break;
                case 5:
                System.out.println("This is friday");
                break;
                case 6:
                System.out.println("This is saturday");
                break;
                case 7:
                System.out.println("This is sunday");
                default:
                    System.out.println("Plese enter valid date");

        }
    }
}
