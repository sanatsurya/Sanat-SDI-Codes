package WeeklyAssignments.Assignments18_07_2022;

import java.util.Scanner;

public class CustomException extends Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String name = sc.nextLine();
        if (name.equals("bishnu")){
            System.out.println("You are god and your name is: "+ name);
        } else if (name.equals("sanat")) {
            System.out.println("You are the one who can get acess to baikuntha your name is "+ name);
        }else if (name.equals("jelu")) {
            System.out.println("You are the one who can get acess to baikuntha your name is "+ name);
        }
        else {
            throw new RuntimeException("Sorry you may not have to permit for the baikuntha");
        }
    }
}
