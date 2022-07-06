package PracticeProjects.StringReleated.DigitReleated;

import java.util.Scanner;

public class CountNoOfDigit {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)>='0'&&name.charAt(i)<='9'){
                num++;
            }
        }
        System.out.println("There are " + num+ " number In this word");
    }
}
