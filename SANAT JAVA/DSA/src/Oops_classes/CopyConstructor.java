package Oops_classes;
class Student{
	int Student_Id;
	String Student_Name;
	String Student_Address;
	int Student_Class;
	//This is known as copy constructor this will put the value of s1 
	Student(Student s2){
		this.Student_Id= s2.Student_Id;
		this.Student_Name= s2.Student_Name;
		this.Student_Class= s2.Student_Class;
		this.Student_Address = s2.Student_Address;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public void PrintStud() {
		System.out.println(this.Student_Id);
		System.out.println(this.Student_Name);
		System.out.println(this.Student_Address);
		System.out.println(this.Student_Class);
	}
	
}
public class CopyConstructor {
	public static void main(String [] args) {
		Student s1 = new Student();
		s1.Student_Id= 5;
		s1.Student_Name ="Sanat";
		s1.Student_Address="Puri";
		s1.Student_Class= 7;
		Student s2= new Student(s1);
		s2.PrintStud();
	}

}
