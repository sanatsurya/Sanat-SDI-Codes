package MoshUltimateOne.ControlFlow.BreakContinue;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi i am good" + i);
            if (i==2){
                continue;
            }
            if(i==3){
                break;
            }
        }
    }
}
