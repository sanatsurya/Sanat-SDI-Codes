package OOPs.OopsConcepts.Inheritance;
class Animal{
    void eat(){
        System.out.println("Animal have to eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("vow");
    }
}
class Babydog extends Dog{
    void color(){
        System.out.println("Brown color");
    }
}
class Cat extends Animal{
    void bark(){
        System.out.println("Meon");
    }
    void eat(String i){
        System.out.println("Eat food " + i);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        Babydog bd = new Babydog();
        bd.color();
        bd.eat();
        Cat c1 = new Cat();
        c1.bark();
        c1.eat("nonveg");
    }
}
