package MoshUltimateOne.Types.DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfCircle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the radios of a circle: ");
        double radious = br.read();
        double rsquare = radious*radious;
        final double Area = (3.141*rsquare);
        System.out.println("Area of circle is " + Area);
    }
}
