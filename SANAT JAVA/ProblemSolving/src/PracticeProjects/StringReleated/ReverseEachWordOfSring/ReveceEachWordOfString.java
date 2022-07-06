package PracticeProjects.StringReleated.ReverseEachWordOfSring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReveceEachWordOfString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();
        String[]arr = reverse.split("\\s");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
