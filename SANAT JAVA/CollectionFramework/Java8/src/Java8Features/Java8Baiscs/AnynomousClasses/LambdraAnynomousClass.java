package Java8Features.Java8Baiscs.AnynomousClasses;

public class LambdraAnynomousClass {
    interface SolarSystem{
        void rule(String rule);
    }
    static void Planet(){
        SolarSystem s1 = (String rule) -> System.out.println("This planets rule is to " + rule);

        s1.rule("Revolve around the sun");
    }
    static void Sun(){
        SolarSystem s2 = rule -> System.out.println("Sun is the " + rule);
        s2.rule("central object of our SolarSystem");
    }
    public static void main(String[]ar){
        Planet();
        Sun();
    }

}
