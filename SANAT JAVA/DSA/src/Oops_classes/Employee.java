package Oops_classes;

public class Employee {
	private int emp_id;
	public String emp_name;
	public String emp_email;
	String str;
	
	public Employee(int id, String name, String email) {
		this.emp_id = id;
		this.emp_name = name;
		this.emp_email = email;
	}
	
	 public String toString() {
		   this.str=emp_id+" "+emp_name+" "+emp_email;
		   return str;
	       
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(12, "Sanat","sanat@email.com");
		Employee emp2 = new Employee( 18, "Jyouti Prakash","jyouti@gmail.com");
		//String s1=emp1.toString();
		System.out.println("Employee 1" +emp1);
		System.out.println("Employee 2"+ emp2);
	}

}
