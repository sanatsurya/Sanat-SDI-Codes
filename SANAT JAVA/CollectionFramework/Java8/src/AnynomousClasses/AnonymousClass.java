package AnynomousClasses;

interface Operation{
    int add(int a, int b);
    int sub(int a, int b);
}
//Implementation of interface
class OperationClass implements Operation{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        OperationClass addnormal = new OperationClass();
        System.out.println("The addition of 10 & 15 is "+addnormal.add(10,15));
        System.out.println("Substarat 10 from 15 is " + addnormal.sub(15,10));
        /*Instead of adding separate class and implement the interface we can directly use the defination while creating
         the object this is known as anonymous class*/
        //In place implementation of an Interface => Known as Anonymous class
        Operation operation = new Operation() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public int sub(int a, int b) {
                return a-b;
            }
        };//This concept is called as anonymous inner class
        System.out.println("Addition of 5 and 6 is " + operation.add(5,6));
        System.out.println("Substation of 5 from 6 is" + operation.sub(6,5));


    }
}
