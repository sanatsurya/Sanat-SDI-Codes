package PracticeProjects.StringReleated.CheckEverything;
//Wap to count number of digit present in it+ total no of small character and capital charater in it+ total no of alphabet numbers+ special character in it+ vowels present in it+ total no of words present in sentence
import java.util.Scanner;

public class FirstOne {
    public static void main(String[] args) {
        int special_char = 0;
        int capital = 0;
        int small = 0;
        int word = 0;
        int vowel = 0;
        int alphabets = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input something: ");
        String name = sc.nextLine();
        if (name.length() != 0) {
            for (int i = 0; i < name.length(); i++) {
                if(name.charAt(i)!=' ') {
                    word++;
                }
                if (name.charAt(i) > 32 && name.charAt(i) < 47 && name.charAt(i) > 58 && name.charAt(i) < 64 && name.charAt(i) > 91 && name.charAt(i) < 96 && name.charAt(i) > 123 && name.charAt(i) < 126) {
                    special_char++;
                }
                if (name.charAt(i) >= 97 && name.charAt(i) <= 122) {
                    small++;
                }
                if (name.charAt(i) >= 65 && name.charAt(i) <= 90) {
                    capital++;
                }
                if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U') {
                    vowel++;
                }
                if(name.charAt(i) >= 65 && name.charAt(i) <= 90&&name.charAt(i) >= 97 && name.charAt(i) <= 122){
                    alphabets++;
                }
            }
            System.out.println("Number of words containts in the string is: "+ word +" Number of small letter is: "+small+" Number of capital letter is: "+capital+" Number of alphabets present in it is"+alphabets+" Number of special character: "+ special_char+ " Number of vowels present in it is "+ vowel);
        }
        else {
            System.out.println("There is nothing in the string");
        }

    }
}
