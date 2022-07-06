package MoshUltimateOne.Types.DataTypesAndVariables;

public class StringTypes {
    public static void main(String[] args) {
        String name= "  Hello world" +"&";
        System.out.println(name);
        System.out.println(name.contains("x"));
        System.out.println(name.startsWith("H"));
        System.out.println(name.length() +" Is the length of this message");
        System.out.println("The index of message is " + name.indexOf("l"));
        System.out.println(name.toUpperCase());
        System.out.println(name.isEmpty());
        System.out.println(name.replace("w","m"));
        System.out.println(name.trim());
        System.out.println(name.endsWith("a"));
        String test;
        test="Hi biswajit";
        System.out.println(test);
    }
}
