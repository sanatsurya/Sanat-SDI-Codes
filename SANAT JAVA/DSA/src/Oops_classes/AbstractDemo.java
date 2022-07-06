package Oops_classes;
abstract class dog{
	abstract void bread();
}
//This is known as abstract inherits
class Labrador extends dog{

	public void bread() {
		System.out.println("This is a pamilan dog");
	}
	
}
class Pamiion extends dog{
	public void bread() {
		System.out.println("This is a pamilian dog");
	}
}
class Rotwiller extends dog{
	public void bread() {
		System.out.println("This is a Rotwiller dog");
	}
	public void walk() {
		System.out.println("this is rotiwl");
	}
}

public class AbstractDemo {
	public static void main (String [] args) {
		Labrador ld = new Labrador();
		ld.bread();
		Pamiion pd = new Pamiion();
		pd.bread();
		Rotwiller rw = new Rotwiller();
		rw.bread();
		rw.walk();
	}

}
