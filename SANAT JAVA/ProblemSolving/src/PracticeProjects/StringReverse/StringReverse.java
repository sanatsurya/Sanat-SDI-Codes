package PracticeProjects.StringReverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Write a program to accept a stream and reverse it
public class StringReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a String");
        String firstStr = br.readLine();
        StringBuilder obj = new StringBuilder(firstStr);
        obj.reverse();
        System.out.println("Reverse of String is");
        System.out.println(obj);
    }
}
