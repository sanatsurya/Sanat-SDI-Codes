package Assignment12_05_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private String name;
    private int roll_no;
    private int fee;
    Student(int roll_no,String name,int fee){
        this.roll_no= roll_no;
        this.name = name;
        this.fee= fee;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student Name='" + name + '\'' +
                ", Roll No=" + roll_no +
                ", Course Fee=" + fee +
                '}';
    }
}
class CompareStudent implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getFee()>s2.getFee()){
            return 1;
        } else if (s1.getFee()<s2.getFee()) {
            return -1;
        }
        return 0;
    }

//    @Override
//    public int compare(Student s1, Student s2) {
//        if(s1.getRoll_no()>s2.getRoll_no()){
//            return 1;
//        } else if (s1.getRoll_no()<s2.getRoll_no()) {
//            return -1;
//        }
//        return 0;
//    }

}
public class ComparatorUsingAssign3 {
    public static void main(String[] args) {
        List<Student> sd = new ArrayList<>();
        sd.add(new Student(4,"Bidwan",2450));
        sd.add(new Student(7,"Panita",7800));
        sd.add(new Student(55,"Purohitya",9800));
        sd.add(new Student(72,"Adarshawadi",800));
        sd.add(new Student(9,"Byabhichari",70800));
        sd.add(new Student(2,"Dharmagyan",700));
        sd.add(new Student(1,"ArthaSastrabit",630));
        sd.add(new Student(3,"Karmaporahitya",800));
        for(Student s:sd){
            System.out.println(s);
        }
        System.out.println("*********After Comparator***********");
        Comparator<Student> cs = new CompareStudent();
        Collections.sort(sd, cs);
        for(Student s:sd){
            System.out.println(s);
        }
    }
}
