package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private int student_id;
    private String stud_email;
    private String city;
    Student(String name, int student_id, String stud_email,String city){
        this.name=name;
        this.student_id=student_id;
        this.stud_email =stud_email;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", Student Id=" + student_id +
                ", Email='" + stud_email + '\'' +
                ", City='" + city + '\'' +
                '}';
    }

//This for shorting name wise
    @Override
    public int compareTo(Student s1) {
        return this.name.compareTo(s1.name);
    }
//This for sorting of Student id
//    @Override
//    public int compareTo(Student o) {
//        if(this.student_id> o.student_id){
//            return 1;
//        } else if (this.student_id<o.student_id) {
//            return -1;
//        }
//        return 0;
//    }


    //This is used to compare city
//    @Override
//        public int compareTo(Student o) {
//            return this.city.compareTo(o.city);
//    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> std = new ArrayList<>();
        std.add(new Student("satya",7845,"satya@email.com","Puri"));
        std.add(new Student("sanat",5654,"sanat567@email.com","Astaranga"));
        std.add(new Student("jyouti",9875,"jyouti@email.com","Kakatpur"));
        std.add(new Student("biswa",2145,"biswa@email.com","Dhenkanal"));
        std.add(new Student("amit",45012,"amit@email.com","Bhubaneswar"));
        std.add(new Student("akash",57845,"78akash@email.com","Baragada"));
        std.add(new Student("chinmaya",7534,"satya87@email.com","Sankanada"));
        for(Student s:std){
            System.out.println(s);
        }
        Collections.sort(std);
        System.out.println("*********Print after Shorting**************");
        for(Student s:std){
            System.out.println(s);
        }
    }
}
