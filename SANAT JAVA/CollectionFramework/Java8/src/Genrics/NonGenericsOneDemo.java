package Genrics;

public class NonGenericsOneDemo {
    public static void main(String[] args) {
        var list = new BaseClass();
        list.add(Integer.valueOf(4));
        list.add("sanat");
        list.add(new BaseClass());
        System.out.println(list);
        System.out.println(list.get(2));
        int number = (int) list.get(1);
        System.out.println(number);
    }
}
