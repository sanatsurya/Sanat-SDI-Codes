package PracticeProjects.VowelsOrNotVowels;

import java.util.Scanner;
//Write a programme to count vowel is greater than or consonant is greater than
public class CheackVowelWhileNotEnterSpecificChar {
    public static void main(String[] args) {
        char ch =' ';  int vl,nvl;
        vl=nvl=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("input char");

        while (ch !='!'){
            ch=sc.next().charAt(0);
            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                vl++;
            }
            else {
                nvl++;
            }
        }
        System.out.println("vouls is " + vl);
        System.out.println("Non vowels is " +nvl);
        if(vl>nvl){
            System.out.println("Vowel is greater than non vowel");
        }
        else {
            System.out.println("Non vowel is greater than vowel");
        }
    }
}
