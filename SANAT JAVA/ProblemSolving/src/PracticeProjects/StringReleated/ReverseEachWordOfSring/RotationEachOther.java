package PracticeProjects.StringReleated.ReverseEachWordOfSring;

import java.util.Scanner;

public class RotationEachOther {
    public static void main(String[] args) {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert Name: ");
        String name1 = sc.nextLine();
        System.out.print("Insert Name2: ");
        String name2 = sc.nextLine();
//        StringBuilder sb = new StringBuilder(name2);
//        String rotation = String.valueOf(sb.reverse());
//        if (name1.equals(rotation)){
//            System.out.println("These two string are rotation");
//        }else {
//            System.out.println("These are not rotation");
//        }
        char[] chname1 = name1.toCharArray();
        char[] chname2 = name2.toCharArray();
        if(name1.length()==name2.length()){
            for (int i = 0; i < chname1.length; i++) {
                for (int j = 0; j < chname2.length; j++) {
                    if (chname1[i]==chname2[j]){
                       count++;
                    }
                }
            }
            if (count==name1.length()){
                System.out.println("The name is rotational");
            }else{
                System.out.println("These name is not rotational");
            }
        }
        else {
            System.out.println("These name is not rotational");
        }



    }
}
