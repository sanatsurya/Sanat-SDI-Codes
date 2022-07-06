package MoshUltimateOne.ControlFlow.Looping;

import java.util.Scanner;

public class SwitchCade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name");
        String name = sc.nextLine();
        switch (name){
            case "sanat":
                System.out.println("You are legend");
                break;
            case "biswajit":
                System.out.println("You are a noob player");
                break;
            default:
                System.out.println("You are noobs");
        }
    }
}
