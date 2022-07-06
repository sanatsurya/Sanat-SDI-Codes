package Assignment11_05_2022;
//Write a Java program to iterate through all elements in a array list
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAsgn2 {
    public static void main(String[] args) {
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.add(10);
        ar2.add(20);
        ar2.add(30);
        ar2.add(40);
        ar2.add(50);
        ar2.add(80);
        ar2.add(90);
        ar2.add(115);
        ar2.add(1245);
        ar2.add(1798);
        ar2.add(1468);
        Iterator<Integer> itr1 = ar2.iterator();
        while (itr1.hasNext()){
            System.out.print("  "+itr1.next());
            System.out.print("");
        }
    }
}
