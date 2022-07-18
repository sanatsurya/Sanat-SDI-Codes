package Introdution.Oops.ClassObject;
class Car{
    String type;
    String company;
    int millage;
    public void PrintCar(){
        System.out.println("The car is the type of "+type);
        System.out.println("The car is from "+ this.company+"this company");
        System.out.println("The cars millage is "+ this.millage+" KMPL");
    }
}
public class ClassObjectsDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.type="Sports";
        car1.company="Maclaren";
        car1.millage=24;
        car1.PrintCar();
        Car car2 = new Car();
        car2.type="Sedan";
        car2.company="Suzuki";
        car2.millage=18;
        car2.PrintCar();
    }
}
