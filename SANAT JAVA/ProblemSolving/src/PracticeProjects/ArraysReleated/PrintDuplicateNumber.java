package PracticeProjects.ArraysReleated;
//Write a programe to print duplicate elements of array
public class PrintDuplicateNumber {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2,3,9};
        // int temp = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] == a1[j]) {
                    System.out.println(a1[i]);

                }
            }
        }

    }
}

