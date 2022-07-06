package SteemsInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethords {
    public static void main(String[] args) {
        List<Integer> objects = Arrays.asList(50,87,9,14,17);
        Stream<Integer> streamobj = objects.stream();
//        streamobj.forEach(e-> {
//            System.out.println(e);
//        });
//        objects.stream().map(i-> i*i).forEach(i-> {
//            System.out.println(i);
//        });
        List<String> student = List.of("sanat", "xavier","newbie","juvlin");
//        student.stream().filter(i->i.contains("a")).forEach( e-> {
//            System.out.println(e);
//        });
//        objects.stream().filter(i->i%2==0).map(i->i*4).forEach(System.out::println);
//        objects.stream().sorted().forEach(System.out::println);
        Integer integern = objects.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(integern);
    }
}
