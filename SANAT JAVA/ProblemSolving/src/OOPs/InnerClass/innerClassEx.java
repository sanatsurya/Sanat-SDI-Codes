package OOPs.InnerClass;
//Outer class
class Outerclass{
    //Static member
    static int outer_X= 10;
    //instant nonstatic member
    int outer_y= 15;
    //private member
    private int outer_Z=20;
    class Innerclass{
        void Print(){
            //It can access static member of outer class
            System.out.println("outer_X" + outer_X);
            //It can access nonstatic member of outer class
            System.out.println("outer_y"+ outer_y);
            //It can acess private member of outer class
            System.out.println("outer_Z"+outer_Z);
        }
    }

}
public class innerClassEx {
    public static void main(String[] args) {
        //Acess an inner class
        Outerclass outerObj = new Outerclass();
        Outerclass.Innerclass innerObj = outerObj.new Innerclass();
        innerObj.Print();
    }
}
