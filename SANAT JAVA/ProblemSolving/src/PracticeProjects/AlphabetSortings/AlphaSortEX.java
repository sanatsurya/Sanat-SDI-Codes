package PracticeProjects.AlphabetSortings;
//Write a progrrame to accept a string and sort it
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlphaSortEX {
    public static void main(String[] args) {
        String arr[] = {"z","c","a","f","y","k"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<String> alphaArray = Arrays.stream(arr).sorted().collect(Collectors.toList());
        System.out.println(alphaArray);

    }

}
