package SpringBasics;

class Car{
    String type;
    int model_no;
    String whelltype;
    int price;

    public Car(String type, int model_no,String wheeltype, int price) {
        this.type = type;
        this.model_no = model_no;
        this.whelltype= wheeltype;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model_no=" + model_no +
                ", whelltype='" + whelltype + '\'' +
                ", price=" + price +
                '}';
    }
}
class G_wagon{
    String Model;
    int Top_speed;
    Car car;

    public G_wagon(String model, int top_speed, Car car) {
        super();
        Model = model;
        Top_speed = top_speed;
        this.car=car;
//        this.car=new Car("Soprts",456545);//This is known as tightly coupling cause the changes in supper class is very impact on it.
    }

    @Override
    public String toString() {
        return "G_wagon{" +
                "Model='" + Model + '\'' +
                ", Top_speed=" + Top_speed +
                ", car=" + car +
                '}';
    }
}
public class DependencyInjection {
    public static void main(String[] args) {
        Car c1 = new Car("Supper",4546,"4 wheeler",75000);//This is known as dependency injection
        G_wagon g1 = new G_wagon("Mercidese Benz ",260,c1);
        System.out.println(g1);
    }

}
