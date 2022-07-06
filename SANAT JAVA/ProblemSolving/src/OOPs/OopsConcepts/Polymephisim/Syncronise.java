package OOPs.OopsConcepts.Polymephisim;

class Vehicle {
    synchronized void show(String type) {
        System.out.println("This is vehicle");
    }
}

class Car extends Vehicle {
    void show(int a) {
        System.out.println("x" + a);
    }
}

class a {
    String a(String a) {
        System.out.println("This is " + a);
        return a;
    }

    int a(int a) {

        return a;
    }
}

public class Syncronise {
    public static void main(String[] args) {
        Car ob1 = new Car();
        ob1.show("vehicle");
        a ob2 = new a();
        System.out.println(ob2.a(2));
        System.out.println(ob2.a("abc"));
    }
}
