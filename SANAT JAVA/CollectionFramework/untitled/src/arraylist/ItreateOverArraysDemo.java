package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItreateOverArraysDemo {
    public static void main(String [] args){
        List<Integer> n1 = new ArrayList<>();
        n1.add(15);
        n1.add(17);
        n1.add(18);
        n1.add(19);
        n1.add(20);
        n1.add(21);
        System.out.println(n1.contains(150));//This is check the element is available or not
        System.out.println(n1);
        for (int i = 0; i< n1.size(); i++)
            System.out.println("The value of this index is " + n1.get(i));
        Iterator<Integer> itr = n1.iterator();
        while (itr.hasNext()){
            System.out.println("Iterator" + itr.next());
        }
    }
}
