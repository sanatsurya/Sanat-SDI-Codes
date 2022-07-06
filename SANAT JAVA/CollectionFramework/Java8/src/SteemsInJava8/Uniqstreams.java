package SteemsInJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

class Billionairs{
    private String name;
    private int networth;

    public Billionairs(String name, int networth) {
        this.name = name;
        this.networth = networth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetworth() {
        return networth;
    }

    public void setNetworth(int networth) {
        this.networth = networth;
    }

    @Override
    public String toString() {
        return "Billionairs{" +
                "Name='" + name + '\'' +
                ", Networth in billion=" + networth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Billionairs that = (Billionairs) o;
        return networth == that.networth && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, networth);
    }
}
public class Uniqstreams {
    public static void main(String[] args) {
        int arr[] ={1,2,3,5,7,9,10,4,9,15,2,4};
        Arrays.stream(arr).forEach(n-> System.out.print(n + " "));
        System.out.println("After print uniq value");
        Arrays.stream(arr).distinct().forEach(System.out::print);
        List<Billionairs> billionairs = Arrays.asList(
                new Billionairs("Elonmusk",7800),
                new Billionairs("Jeff Bezos",1800),
                new Billionairs("Warren Buffet",2400),
                new Billionairs("Billi gates",580),
                new Billionairs("Billi gates",580),
                new Billionairs("Billi gates",580),
                new Billionairs("Billi gates",580),
                new Billionairs("Adani",230)
        );
        billionairs.stream().distinct().forEach(System.out::println);
        billionairs.stream().filter(i->i.getNetworth()>5000).forEach(System.out::println);
        System.out.println("\n after skipping elements 2 ");
        billionairs.stream().skip(2).forEach(System.out::println);//I ts for skip first two elements
        System.out.println("\n after skipping elements 2 and limit elemets 2 ");
        billionairs.stream().skip(2).limit(2).forEach(System.out::println);//I ts for skip first two elements
        Supplier<Double> supplier = ()-> Math.random()*1000;
        Stream.generate(supplier).limit(5).forEach(System.out::println);
        System.out.println("Generating unary operator");
        UnaryOperator<Integer> unaryOperator = num->++num;

        Stream.iterate(5 ,unaryOperator).limit(10).forEach(num-> System.out.print(num +" "));
        List<String> list2 = Arrays.asList("Hitesh","Khitish","Ankit","Mukesh","Bhupen");
        list2.stream().sorted((x,y)->x.compareTo(y)).forEach(System.out::println);
        System.out.println("*********************************");
        list2.stream().sorted(Comparator.comparing(n-> n)).forEach(System.out::println);
    }
}
