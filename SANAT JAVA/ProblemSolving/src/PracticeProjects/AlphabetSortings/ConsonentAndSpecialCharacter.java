package PracticeProjects.AlphabetSortings;

import java.util.Scanner;

//Wap to accept a string number to count consonants and special characters
public class ConsonentAndSpecialCharacter {
    public static void main(String[] args) {
        int consonant =0;
        int specialchar=0;
        int vowels=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text here: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                vowels++;
            }  else if (name.charAt(i)>32&&name.charAt(i)<47||name.charAt(i)>58&&name.charAt(i)<64 ||name.charAt(i)>91&&name.charAt(i)<96|| name.charAt(i)>123&&name.charAt(i)<126){
                specialchar++;
            }
            else {
                consonant++;
            }
        }
        System.out.println(consonant+" consonant's are in this letter");
        System.out.println();
        System.out.println(specialchar+" special characters are in the consonant");
    }
}
