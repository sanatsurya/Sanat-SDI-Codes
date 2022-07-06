package ProblemSolving;

public class CheqArray {
    public static int solution(int[] x, int[] y) {
        int additional=0;
        int a[],b[];
        boolean isavailable= false;
        if(x.length>y.length){
            a=x;
            b=y;
        }
        else {
            a=y;
            b=x;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]){
                    isavailable=true;
                }
            }
            additional=a[i];
        }
        return additional;
    }

    public static void main(String[] args) {
        int x[]= new int[]{13, 5, 6, 2, 5};
        int y[] = new int[]{5, 2, 5,13};
        System.out.println("Additional element is "+CheqArray.solution(x,y));
    }
}


