package Stack;
import javax.xml.transform.Source;
import java.util.Iterator;
import java.util.Stack;


public class StackCollectionDemo2 {
    public static void main(String [] args){
        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Elephant");
        animal.push("Tiger");
        animal.push("Monkey");
        animal.push("Dog");
        System.out.print(animal);
        System.out.println(animal.get(1));//This will return an object at specific location
        System.out.println(animal.peek());
        animal.pop();
        System.out.println(animal.peek());
       // animal.clear();//This is used to clear hole stack
        System.out.println(animal);
        Iterator<String> itr1 = animal.iterator();
        while (itr1.hasNext()){
            System.out.println("Stack by " +itr1.next());
        }
    }
}
