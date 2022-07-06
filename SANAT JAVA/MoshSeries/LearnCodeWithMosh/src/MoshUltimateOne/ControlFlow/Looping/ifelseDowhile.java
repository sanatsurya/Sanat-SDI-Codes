package MoshUltimateOne.ControlFlow.Looping;

public class ifelseDowhile {
    public static void main(String[] args) {
        //For each
        for (int a = 0; a < 5; a++) {
            System.out.println("Hi there");
        }
        int number = 5;
        //Do while code
        do{
            System.out.println("statement one");
        }
        while (number<=1);
        //If else code
        if(number==5){
            System.out.println("run statement");
        }
        else {
            System.out.println("number is no enabled");
        }
        //while Loop
        System.out.println("#########This is while loop#############");
        String name = "Sanat";
        int num = 1;
        while (name=="Sanat"&&num<=5){
            System.out.println("Name is sanat");
            num++;
        }
    }
}
