package WeeklyAssignments.Assignment16_07_2022;

import java.util.Scanner;

public class FindMissingNumber  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int sumOfAll = (n * (n + 1)) / 2;
        int inputArr[] = new int[n];
        System.out.println("Enter (n-1) numbers: ");
        for (int i = 0; i <= n - 2; i++) {
            inputArr[i] = sc.nextInt();
        }

        int sumOfArr = 0;
        for (int i = 0; i <= n - 2; i++) {
            sumOfArr += inputArr[i];
        }
        int missingNumber = sumOfAll - sumOfArr;
        System.out.println("Missing number is: " + missingNumber);
    }
}
