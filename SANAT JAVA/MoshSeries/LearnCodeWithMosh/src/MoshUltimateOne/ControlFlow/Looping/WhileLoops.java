package MoshUltimateOne.ControlFlow.Looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileLoops {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter something: ");
         String str = br.readLine();
         while (!str.equals("quite")){
             System.out.print("Please enter something: ");
             str= br.readLine();
             System.out.print(str);
             System.out.println();
         }
    }
}
