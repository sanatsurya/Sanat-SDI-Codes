package OOPs.AbstractClass;
abstract class  School{
    abstract String name();
}
class Student extends School {

    @Override
    String name() {
        return "Sanat";
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name());
    }
}
