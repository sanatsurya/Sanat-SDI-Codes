package PracticeProjects.VowelsOrNotVowels;

import java.util.Scanner;

public class positionOfFirstVowel  {
    public static void main(String[] args) {
        int position = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input some thing: ");
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                position = i;
                break;
            }
        }
        if(position==0){
            System.out.println("Sorry no vowel");
        }
        else {
            System.out.println("Vowel is at position "+ position);
        }
    }
}
