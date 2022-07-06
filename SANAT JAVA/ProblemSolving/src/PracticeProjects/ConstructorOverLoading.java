package PracticeProjects;

class Country{
    public String name;
    public int code;
    Country(){
        System.out.println("Default constructor is initialized");
    }

    public Country(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("name is " + name);
        System.out.println("Code is " + code);
    }

}
public class ConstructorOverLoading {
    public static void main(String[] args) {
        Country country = new Country();
        System.out.println(country);
        Country country1 = new Country("India",91);

    }
}
