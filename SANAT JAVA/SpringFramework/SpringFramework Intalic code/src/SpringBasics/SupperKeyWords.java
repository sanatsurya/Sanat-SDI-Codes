package SpringBasics;
class Animal{
   String name="Animals";

   public Animal() {
      System.out.println("Animal");
   }
   //   public void same(){
//      System.out.println("This is in parent class same method");
//   }
}
class Lion{
   String name = "Lion";

   Lion() {
      System.out.println("This initiate lion class constructor");
   }
   public void same(){
      System.out.println("This is in child class object");
   }
}
public class SupperKeyWords {
   public static void main(String[] args) {
      Lion obj = new Lion();
//      obj.same();
   }

}
