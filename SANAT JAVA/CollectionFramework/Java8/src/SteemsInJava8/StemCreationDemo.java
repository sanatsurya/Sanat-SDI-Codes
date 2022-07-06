package SteemsInJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StemCreationDemo {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 55, 78, 98, 65, 24, 69);
        List<Integer> list2 = Arrays.asList(7, 9, 11, 25, 68, 45, 97, 25,22,1978);
        List<Integer> listeven = new ArrayList<>();
//        without streem
        for(Integer i:list2){
            if(i%2==0){
                System.out.println( i + " is a even number " );
                listeven.add(i);
            }
        }
        System.out.println("List of even numbers are "+listeven);
//        With streem
        Stream<Integer> streamlist1 = list1.stream();
        streamlist1.filter(i-> i%2==0).collect(Collectors.toList());
        List<Integer> upto100 = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            upto100.add(i);
            System.out.println("adding to upto100 " + i);
        }
        Stream<Integer> str1 = upto100.stream();
        List<Integer> collectevenupto100 = str1.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collectevenupto100);
        System.out.println("The even numbers size is " + collectevenupto100.size());
        Stream<Integer> str2 = upto100.stream();
        List<Integer> oddcollect = str2.filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println("The odd numbers are " + oddcollect);
        System.out.println("The odd numbers size is " + oddcollect.size());
//        Stream<Integer> primenumstrm = upto100.stream();
//        List<Integer> primecollect = primenumstrm.filter(i -> i/i==1&& i/1==i && i%u).collect(Collectors.toList());
//        System.out.println("Prime number is" +primecollect);


    }
}
