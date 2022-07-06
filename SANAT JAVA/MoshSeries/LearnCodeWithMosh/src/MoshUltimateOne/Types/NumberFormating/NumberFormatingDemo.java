package MoshUltimateOne.Types.NumberFormating;

import java.text.NumberFormat;

public class NumberFormatingDemo {
    public static void main(String[] args) {
        NumberFormat price = NumberFormat.getCurrencyInstance();
        String result = price.format(54552489.221);
        System.out.println(result);
        String result2= NumberFormat.getPercentInstance().format(0.75);
        System.out.println(result2);
    }
}
