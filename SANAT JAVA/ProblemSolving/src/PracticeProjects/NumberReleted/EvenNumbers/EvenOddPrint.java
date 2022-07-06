package PracticeProjects.NumberReleted.EvenNumbers;

//wap to accept teo numbers and display keven and odd numbers separately
public class EvenOddPrint {
    public static void main(String[] args) {
        System.out.print("The odd numbers are: ");
        for(int i=1;i<=10;i+=2)
        {
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.print("The even numbers are: ");
        for(int j=2;j<=10;j+=2)
        {
            System.out.print(j+" ");
        }
    }
}
