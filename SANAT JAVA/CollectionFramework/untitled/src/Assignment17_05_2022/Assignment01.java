package Assignment17_05_2022;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
class Domwork implements Comparable<Domwork>{
    private String name ;
    Domwork(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Domwork{" +
                "Name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Domwork o) {
        return this.name.compareTo(o.name);
    }
}
//Write  a  java  program  toto  short  the  string objects inside a linked list considering the first char of the strings and display it.
public class Assignment01 {
    public static void main(String[] args) {
        List<Domwork> ll1 = new LinkedList<>();
        ll1.add(new Domwork("sanat"));
        ll1.add(new Domwork("GaganBihari"));
        ll1.add(new Domwork("Manaswini"));
        ll1.add(new Domwork("Amit palai"));
        ll1.add(new Domwork("Jyouti"));
        ll1.add(new Domwork("Biswa"));
        ll1.add(new Domwork("Zido"));
        ll1.add(new Domwork("Samer"));
        ll1.add(new Domwork("Abadhuta"));

        for(Domwork d:ll1){
            System.out.println(d);
        }
        Collections.sort(ll1);
        System.out.println("**************************After Reversing linked-list****************************");
        for(Domwork d:ll1){
            System.out.println(d);
        }
    }
}
