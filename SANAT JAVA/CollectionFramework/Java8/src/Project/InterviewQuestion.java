package Project;

import java.util.Arrays;
import java.util.List;

public class InterviewQuestion {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(108,50,8,9,4,8,11,2,3,7);
        int list1[]  = {108,50,8,9,4,8,11,2,3,7};
//        list.stream().sorted().forEach(System.out::println);
        int count =0;
        for (int i = 0; i < list1.length; i++) {
            count =i;
            if(i>count){
                list1[i]=list1[count];
            }
            System.out.println(Arrays.toString(list1) +"After sorting");
        }


    }
}
