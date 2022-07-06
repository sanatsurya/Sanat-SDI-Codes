package PracticeProjects.Anagram;

//Find two input words are annagram or not
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDemo {
    public static void main(String[] args) {
        boolean anagram = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert first word: ");
        String name1 = sc.nextLine();
        System.out.println("Please insert second word: ");
        String name2 = sc.nextLine();
        String str1 = name1.toLowerCase();
        String str2 = name2.toLowerCase();

        if (str1.length()==str2.length()){
            char[] chararray1 = str1.toCharArray();
            char[] chararray2 = str2.toCharArray();
            Arrays.sort(chararray1);
            Arrays.sort(chararray2);
            boolean equals = Arrays.equals(chararray1,chararray2);
            if (equals){
                System.out.println("This is a anagram");
            }
            else {
                System.out.println("Given two words are not anagram");
            }
        }
        else{
            System.out.println("Given two words are not anagram");
        }
    }
}
