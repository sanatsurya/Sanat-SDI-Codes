package Oops_classes;
class Add{
	int a;
	int b;
	public void AddNum() {
		System.out.println("Addition of the number is " +(this.a + this.b));
	}
	public void SubNum() {

		if(a<b)
			System.out.println("Substraction of number is " + (this.b - this.a));
		else
			System.out.println("Substraction of number is " + (this.a - this.b));
	}
	public void MultNum() {
		System.out.println("Multiplication of The number is " + (a*b));
		
	}
	public void DivNum() {
		if (a<b) {
			System.out.println("Division of number is " + (this.b / this.a));
		}
		else
			System.out.println("Division of number is " +(this.a/ this.b));
	}
}
public class AdditionSubstraction {
	public static void main(String[] args) {
		Add eqn1 = new Add();
		eqn1.a = 8;
		eqn1.b = 16;
		eqn1.AddNum();
		eqn1.SubNum();
		eqn1.MultNum();
		eqn1.DivNum();
		
		
		
	}
}
