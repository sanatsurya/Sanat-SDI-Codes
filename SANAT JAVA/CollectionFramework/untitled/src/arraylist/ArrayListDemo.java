package arraylist;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String [] arr){
        ArrayList<String> Student = new ArrayList<>();

        try{
            Student.add("Khan");
            Student.add("Sanat");
            Student.add("Aryan");
            Student.add("1");
            //Student.remove(0);
            //This is used to print hole array
            Student.add(0,"Sanat surya");
           // System.out.println(Student);
            //Student.clear();//This will clear all value of given array.
            Student.set(1,"Pradumna");//It set the value at index 1 by given value.
            System.out.println(Student.contains(""));
        }
        catch (Exception e){
            System.out.println("An error occurred in your input string "+e.getMessage());
        }
        List<String> num = new ArrayList<>();
        try{
            num.addAll(Student);
           // System.out.println(num);
            num.remove(String.valueOf("Sanat"));// It will override previous method and delete by value by giving datatype.valueof(name);
            System.out.println(num);
            num.remove(Integer.valueOf(5));//It's not an exception.
            System.out.println(num.get(0));

        }
        catch (Exception e){
            System.out.println("The error is occurred due to" + e.getMessage());

        }

    }
}
