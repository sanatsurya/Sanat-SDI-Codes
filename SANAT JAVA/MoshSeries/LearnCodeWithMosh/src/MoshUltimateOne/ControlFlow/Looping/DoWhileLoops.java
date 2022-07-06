package MoshUltimateOne.ControlFlow.Looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileLoops {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter something: ");
        String str = br.readLine();

        do {
            System.out.print("Please enter something: ");
            str= br.readLine();
            System.out.print(str);
            System.out.println();
        }while (!str.equals("quite"));
    }
}
