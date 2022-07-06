package MoshUltimateOne.ControlFlow;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortsgeCalculator {
    public static void main(String[] args) {
        int principal =0;
        final byte months_In_Year = 12;
        final byte percentage = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount:  ");
        principal = scanner.nextInt();
        while (true){
            if (principal<=10_000&&principal>1_00_000){
                System.out.println("Please enter valid amount ");
                continue;
            }

            break;
        }
        System.out.println("Principal ammount is "+ principal);
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate= scanner.nextFloat();
        float monthlyInterest = annualInterestRate /percentage/months_In_Year;
        System.out.println("Period (years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years* months_In_Year;
        while (true){
            if (numberOfPayments<=30&&numberOfPayments>=3){
                System.out.println("Loan is available for month between 3 to 30");
                break;
            }
        }
        double mortage = principal*(monthlyInterest *Math.pow(1+ monthlyInterest,numberOfPayments))
                /(Math.pow(1+ monthlyInterest, numberOfPayments)-1);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage is " + mortage);
    }
}
