package PracticeProjects.StringReleated.Concadination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//WAP TO CONCADE TWO STRINGS
public class ConcadinateUsingBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input First Name: ");
        String name = br.readLine();
        System.out.print("Please input last Name: ");
        String nameTwo = br.readLine();
        System.out.println("Your name is "+ name.concat(" "+nameTwo));
    }
}
