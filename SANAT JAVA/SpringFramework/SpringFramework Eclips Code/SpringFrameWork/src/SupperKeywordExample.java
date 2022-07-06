class Animal {
	String name;

	public Animal(String name) {
		super();
		this.name = name;
		System.out.println("Inside parrent class constructor" + name);
	}
	public String getName() {
		System.out.println("");
		return name;
	}
}

class Lion extends Animal{
	String foodType;

	public Lion(String foodType) {
		super("Lion");
		this.foodType = foodType;
		System.out.println("Inside side class");
	}
	public String getFoodType(){
		System.out.println("Inside get food type methord");
		System.out.println("Acessing supper class variable: " + super.name);
		System.out.println("Acessing super class methord: " + super.getName());
		return this.foodType;
		
	}
}

public class SupperKeywordExample {
	public static void main(String[] args) {
		Lion lion1 = new Lion("meat");
	}

}
