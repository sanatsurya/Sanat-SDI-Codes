package SteemsInJava8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjectCreation {
    public static void main(String[] args) {
        // Stream is used to processing of collections
        //Collection/ Group of objects
//        Stream<Object> emptystream = Stream.empty();
//        emptystream.forEach(e->{
//            System.out.println(e);
//        });
//        //2 nd way if you have arrays or objects you can also create a stream using Stream.of
//        String names[] = {"sanat","bishnu","jyouti","raghav"};
//        Stream<String> namestream = Stream.of(names);
////        namestream.forEach(name ->{
////            System.out.println(name);
////        });
//        Stream<Object> buildstream = Stream.builder().build();
        IntStream streamint = Arrays.stream(new int[]{8, 7, 9, 14, 2, 4, 3});
        streamint.forEach( i-> {
            System.out.println(i);
        });
//  List object ,set
    }
}
