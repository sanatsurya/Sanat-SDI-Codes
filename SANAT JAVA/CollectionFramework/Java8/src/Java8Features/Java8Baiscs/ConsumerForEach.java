package Java8Features.Java8Baiscs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
class Consimp implements Consumer{

    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}
public class ConsumerForEach {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("jyouti", "aditya","biswa");
        Consumer<String> cs = input -> System.out.println(input);
        list1.forEach(cs);
        List<Integer> intlist= Arrays.asList(1,8,9,12,17,84,457,2,7);
//        for (int i = 0; i < intlist.size(); i++) {
//            System.out.println(intlist.get(i));
//        }
        Consimp ci = new Consimp();
        intlist.forEach(ci);
        Consumer cji = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };
        list1.forEach(cji);
    }
}
