package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListOne {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>(4);
        List1.add(1);
        List1.add(15);
        List1.add(18);
        List1.add(4);
        List1.add(5);
        List1.add(6);
        System.out.println("Array size is "+ List1.size());
        List1.remove("It will remove the value at index one"+1);
        System.out.println("The values in list one"+List1);
        List1.add( 1,88);//This will replace value of element at index one
        System.out.println(List1);
        ArrayList<Integer> List2 = new ArrayList<>();
        List2.addAll(List1);//this will clone all elements of list1 to list2 there is no change in linq
        System.out.println(List2);
        Collections.reverse(List2);//This is used to reverse an array in collection
        System.out.println(List2);
        ArrayList<Integer> List3= new ArrayList<>();
        Collections.shuffle(List2);
        System.out.println("This is Collection.suffle"+List2);
        Collections.shuffle(List2);
        System.out.println("This is Collection.suffle"+List2);//This is used to randomly arrange elements in a array like cards.
        Collections.shuffle(List2);
        System.out.println("This is Collection.suffle"+List2);//This is used to randomly arrange elements in a array like cards.
        Collections.shuffle(List2);
        System.out.println("This is Collection.suffle"+List2);//This is used to randomly arrange elements in a array like cards.
        Collections.shuffle(List2);
        System.out.println("This is Collection.suffle"+List2);//This is used to randomly arrange elements in a array like cards.
        Collections.shuffle(List2);
        System.out.println("This is Collection.suffle"+List2);//This is used to randomly arrange elements in a array like cards.
        Collections.shuffle(List2);
        System.out.println("This is Collection.suffle"+List2);//This is used to randomly arrange elements in a array like cards.
        Collections.shuffle(List2);
        System.out.println("This is Collection.suffle"+List2);//This is used to randomly arrange elements in a array like cards.
        Collections.shuffle(List2);
        System.out.println("This is Collection.suffle"+List2);//This is used to randomly arrange elements in a array like cards.
        Collections.shuffle(List2);
        System.out.println("This is Collection.suffle"+List2);//This is used to randomly arrange elements in a array like cards.
        List1.retainAll(List2);
        System.out.println("RETAIN"+List2);

    }
}
