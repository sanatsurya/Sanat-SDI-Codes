package arraylist;

public class ArrayDemo {


    public static void main(String[] args) {
        String[] students = new String[15];
        try{
            students[0] = "Jyouti Prakash";
            students[1]= "Sanat surya Mallick";
            students[14]= "Hrudayam";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You have got a error in input string"+ e.getMessage());
            //throw new RuntimeException(e);
        }


    }
}
