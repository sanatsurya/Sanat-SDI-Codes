package ComparatorAndComparable;

import java.util.Comparator;

class Student1{
    private String name;
    private int student_id;
    private String stud_email;
    private String city;
    Student1(String name, int student_id, String stud_email,String city){
        this.name=name;
        this.student_id=student_id;
        this.stud_email =stud_email;
        this.city=city;
    }
}
class CompareStud implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {

    }
}
