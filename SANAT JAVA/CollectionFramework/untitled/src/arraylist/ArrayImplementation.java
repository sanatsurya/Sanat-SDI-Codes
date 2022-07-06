package arraylist;

public class ArrayImplementation {
    public static void main(String[] args) {
        int s1[] = new int[12];// Here new key word is used to create object in class or allocate memory
        int count = 1;
        for (int i = 0; i < s1.length; i++) {
            s1[i] = count;
            count++;
            // System.out.print(s1[i] +" ");//This is for input
        }
        for (int j = 0; j < s1.length; j++) {
            System.out.println(s1[j]);
        }
    }
}