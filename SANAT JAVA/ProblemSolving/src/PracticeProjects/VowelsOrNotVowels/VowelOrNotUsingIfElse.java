package PracticeProjects.VowelsOrNotVowels;

import java.util.Scanner;

//Write a program to accept a character and display the character is vowel or not
public class VowelOrNotUsingIfElse {
    public static void main(String[] args) {
        char ch;
        System.out.println("Please input a character to check it is vowel or not");
        Scanner sc= new Scanner(System.in);
        ch= sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("This is a vowel");
        }
        else {
            System.out.println("This is not a vowel");
        }
    }
}
