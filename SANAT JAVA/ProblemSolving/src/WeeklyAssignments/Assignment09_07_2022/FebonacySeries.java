package WeeklyAssignments.Assignment09_07_2022;
//Write a program to print febonacy
public class FebonacySeries {
    public static void main(String [] args){
       int num1=0;
       int num2=1;
        System.out.println("Febonancy series is ");
        while (num2<200){
            System.out.print(num2+" ");
            num2=num1+num2;
            num1=num2+num1;
        }
    }
}
