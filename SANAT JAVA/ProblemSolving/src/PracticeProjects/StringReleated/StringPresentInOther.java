package PracticeProjects.StringReleated;
//Remove character from first string which are present in the second string
import java.util.Scanner;
import java.util.Stack;

public class StringPresentInOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert name 1: ");
        String str1=sc.nextLine();
        System.out.print("Insert name 2: ");
        String str2=sc.nextLine();
        StringBuilder sb = new StringBuilder(str1);
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str2.length();i++) {
            if(!st.contains(str2.charAt(i))) {
                st.push(str2.charAt(i));
            }
        }
//        for(char ch:st)System.out.print(ch+" ");
        while(!st.isEmpty()){
            for(int j=0;j<sb.length();j++) {
                if(st.peek()==sb.charAt(j)) {
                    sb.deleteCharAt(j);
                }
            }
            st.pop();
        }
        str1=sb.toString();
        System.out.println(str1);
    }
}
