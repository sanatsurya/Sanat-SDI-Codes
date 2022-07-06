package MoshUltimateOne.Types.MathClass;

public class MathClassDemo {
    public static void main(String[] args) {
        int num = Math.round(1.8f);
        System.out.println(num);
        int result = (int) Math.ceil(8.56f);
        System.out.println(result);
        int randomNo = (int) Math.round(Math.random()*1000);
        System.out.println(randomNo);
        int a = 6;
        System.out.println(a++);
        System.out.println(a);
    }
}
