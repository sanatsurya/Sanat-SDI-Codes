package Oops_classes;

class SupperSys{
	String Achara;
	private String Password;
	public String Getpass() {
		return this.Password;
	}
	public void Setpass(String pass) {
		this.Password = pass;
	}
}
public class GeterSeterDemo {
 public static void main(String[] args) {
	SupperSys p1 = new SupperSys();
	p1.Setpass("password@password");
	System.out.println(p1.Getpass());
}
}
