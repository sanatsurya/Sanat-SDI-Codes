package hw_26_04_2022.oops;
class MyStudent{
	private int id;//This can't be acceded directly  due to access modifiers private
	private String name;
	
	public String getName() {
		return name;
	}
	public void setNa(String n) {
		name = n;
	}
	public void setId(int i) {
		id =i;
	}
	public int getId() {
		return id;
	}
}
public class GetrSetrClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStudent Sanat = new MyStudent();
		Sanat.setNa("I am Sanat surya");
		System.out.println(Sanat.getName());
	}

}
