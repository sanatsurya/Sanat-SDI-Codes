package PracticeProjects.VowelsOrNotVowels;

import java.util.Scanner;
//Write a programe to count vowels or not vowels
public class CheqVowelOrNon {
    public static void main(String[] args) {
        char ch;
        int vl,nvl,i;

        vl=nvl=0;
        i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Word");
        while (i<=5) {
            ch = sc.next().charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vl++;
            } else {
                nvl++;
            }
            i++;
        }
            System.out.println("Vowels are in word " + vl);
            System.out.println("Non vowels are in word is" + nvl);
        }


    }


