package Oops_classes;

class Employee1 {
	int emp_id;
	String emp_name;
	String email_id;

	public void PrintEmp() {
		System.out.println(this.email_id);
		System.out.println(this.emp_name);
		System.out.println(this.email_id);
	}
}

public class ClassObj2 {
	public static void main(String[]args) {
		Employee1 emp1 = new Employee1();
		emp1.emp_name= "Sanat";
		emp1.emp_id = 584524566;
		emp1.email_id ="sanat@email.com";
		emp1.PrintEmp();
		Employee1 emp2 = new Employee1();
		emp2.emp_name= "Raghavendra";
		emp2.emp_id = 7845245;
		emp2.email_id = "raghavendra@mail.org";
		emp1.PrintEmp();
	}

}
