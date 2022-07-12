package PracticeProjects.NumberReleted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//WAP TO calculate the sum of the given number
public class SumOfGivenNumber {
    public static void main(String[] args) throws IOException {
        int sum =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        String strength = ""+num1;
        for (int i = 0; i < strength.length(); i++) {
            sum= sum+ Character.getNumericValue(strength.charAt(i));
        }
        System.out.println(sum);
    }
}
