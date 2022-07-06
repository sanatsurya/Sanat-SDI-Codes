package PracticeProjects.NumberReleted.FebonancySeries;
//Out put must be 0 1 1 2 3 5 8 13 21 34 55 89 144
public class FebonancyseriesDemo {
    public static void main(String[] args) {
       int num1,num2;
       num1=0;
       num2=1;
        System.out.print(num1+" ");
        while (num2<198){
            System.out.print(num2+" ");
            num2= num1+num2;
            num1=num2-num1;
        }
    }
}
