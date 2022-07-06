package PracticeProjects.StringReleated.CountWordAndLetter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Write a program to accept a string and display in vertically
//Write a programme to accept a Sentence as string and count how many words it has and how many letters it has.
public class CharacterAndNumberOfWords {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a Sentence: ");
        String sentence = br.readLine();
        System.out.println(sentence.length());
//        System.out.println(sentence);
        System.out.println(sentence);
        for (int i = 0; i < sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
        }
        int countchar = 0;
        int countWord = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)!=' ')
            {
                countchar++;
            }
            else {
                countWord++;
            }

        }
        System.out.println(++countWord +" words contains in this word");
        System.out.println("This senetence contains " + countchar +" characters");
    }
}
