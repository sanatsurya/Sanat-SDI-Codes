package Assignment12_05_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    private int emp_id;
    private  String emp_name;
    private int emp_salary;
    Employee(int emp_id, String emp_name, int emp_salary){
        this.emp_id= emp_id;
        this.emp_name= emp_name;
        this.emp_salary= emp_salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee id=" + emp_id +
                ", Employee Name='" + emp_name + '\'' +
                ", Employee Salary=" + emp_salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.emp_id>o.emp_id){
            return 1;
        } else if (this.emp_id<o.emp_id) {
            return -1;
        }
        return 0;
    }

//    @Override
//    public int compareTo(Employee o) {
//        if(this.emp_salary>o.emp_salary){
//            return 1;
//        } else if (this.emp_salary<o.emp_salary) {
//            return -1;
//        }
//        return 0;
//    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.emp_name.compareTo(o.emp_name);
//    }

}
public class ComparableUsingAssign1 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1548,"Sanat surya",45000));
        emp.add(new Employee(1427,"Jyouti Prakash",705000));
        emp.add(new Employee(154,"Sujan ",750048));
        emp.add(new Employee(1548,"Amit",78454));
        emp.add(new Employee(1548,"Biswa",98547));
        emp.add(new Employee(1548,"Bishnu",68457));
        for(Employee e:emp){
            System.out.println(e);
        }
        Collections.sort(emp);
        System.out.println("***************After Sort**************");
        for(Employee e:emp){
            System.out.println(e);
        }
    }
}
