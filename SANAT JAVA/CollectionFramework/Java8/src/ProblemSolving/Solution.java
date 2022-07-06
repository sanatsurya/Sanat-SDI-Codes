package ProblemSolving;

public class Solution {
    public static int solution(int[] x, int[] y) {
        int a[],b[];
        if(x.length>y.length) {
            a=x;
            b=y;
        }
        else {
            a=y;
            b=x;
        }
        int additional = 0;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag==false) {
                additional=a[i];
            }
            flag=false;

        }
        return additional;
    }



    public static void main(String arr[]) {
        int x[] = new int[] { 13, 5, 6, 2, 5 };
        int y[] = new int[] { 5, 2, 5, 13,};
        System.out.println("Additional Element is: " + Solution.solution(x, y));
    }
}
