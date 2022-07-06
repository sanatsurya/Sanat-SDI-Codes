package com.java.exceptionhandel.Unchacked;
import java.util.ArrayList;
import java.util.Iterator;

public class ConcurenMdExcept {
    public static void main(){
        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                Integer value = it.next();
                System.out.println("List Value:" + value);
                if (value.equals(3))
                    list.remove(value);
            }
        }
        catch (Exception e){
            System.out.println("Error is for "+ e.getMessage());
        }

    }
}
