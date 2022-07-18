package WeeklyAssignments.Assignment16_07_2022;

import java.util.Arrays;
import java.util.Scanner;

public class AngaramStrign {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        String lowsb = string1.toLowerCase();
        String lowsb2 = string2.toLowerCase();
        char[] char1= lowsb.toCharArray();
        char[] char2 = lowsb2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        boolean isAnagram = Arrays.equals(char1,char2);
        if (isAnagram){
            System.out.println("This is anagram");
        }
        else {
            System.out.println("This is not anagram");
        }
    }
}
