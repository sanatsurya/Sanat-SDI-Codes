package MoshUltimateOne.Types.MortageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args) {
        final byte months_In_Year = 12;
        final byte percentage = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate= scanner.nextFloat();
        float monthlyInterest = annualInterestRate /percentage/months_In_Year;
        System.out.println("Period (years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years* months_In_Year;
        double mortage = principal*(monthlyInterest *Math.pow(1+ monthlyInterest,numberOfPayments))
                /(Math.pow(1+ monthlyInterest, numberOfPayments)-1);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage is " + mortage);
    }
}
