package PracticeProjects.RepeatingAndNonRepeating.FindNonRepetingChar;

import java.util.Scanner;

public class NonrepeatingEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String name = sc.nextLine();
//        for (char ch:name.toCharArray()){
//            if (name.indexOf(ch)==name.lastIndexOf(ch)){
//                System.out.println("The non repeating character is: "+ch);
//                break;
//            }
//        }
//        for (int i = 0; i < name.length(); i++) {
//            for (int j = 0; j <name.length() ; j++) {
//                if (name.charAt(i)== name.charAt(j)&& i!=j){
////                    System.out.println(name.charAt(i));
//                    isRepeat=true;
//                }
//                if (isRepeat==true){
//                    System.out.println(name.charAt(i));
//                    break;
//                }
//                break;
//            }
//        }
        for (int i = 0; i < name.length(); i++) {
            boolean isRepeat = false;
            for (int j = 0; j < name.length(); j++) {
                if(i!=j&&name.charAt(i)==name.charAt(j)){
                    isRepeat=true;
                    break;
                }
            }
            if (isRepeat==false){
                System.out.println(name.charAt(i));
                break;
            }
        }
    }
}
