package Oops_classes;
class Pen{
	String Color;
	String Type;
	
	public void Printpen() {
		System.out.println(this.Color);
		System.out.println(this.Type);
	}
}
public class ClassObject {
	public static void main(String []args) {
		Pen p1 = new Pen();
		p1.Color ="Black";
		p1.Type = "Ballpont";
		Pen p2 = new Pen();
		p2.Color = "Green";
		p2.Type = "Gel";
		p1.Printpen();
		p2.Printpen();
	}
}
