package MoshUltimateOne.Types.DataTypesAndVariables;

import java.awt.*;

public class AwtClass {
    public static void main(String[] args) {
        Point point1 = new Point(1,8);
        Point point2 = point1;
        point1.x = 9;
        System.out.println(point2);
    }
}
