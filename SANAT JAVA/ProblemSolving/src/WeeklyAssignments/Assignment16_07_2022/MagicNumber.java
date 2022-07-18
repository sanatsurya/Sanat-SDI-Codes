package WeeklyAssignments.Assignment16_07_2022;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        int sum1 = 0,sum2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a Number");
        int num = sc.nextInt();
        String String1 = ""+num;
        for (int i = 0; i < String1.length(); i++) {
            sum1= sum1+Character.getNumericValue(String1.charAt(i));
        }

        String String2 =""+sum1;
        for (int i = 0; i < String2.length(); i++) {
            sum2=sum2+Character.getNumericValue(String2.charAt(i));
        }
        if (sum2==1){
            System.out.println("The number is magic Number");
        }else {
            System.out.println("The number is not magic number");
        }
    }
}
