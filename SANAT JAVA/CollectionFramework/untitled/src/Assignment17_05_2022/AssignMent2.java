package Assignment17_05_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Write  a  java  program  to make  a  list  of  student  objects  having attributes id and name and make two comparator implementations to short them on the id basisand name basis.
class Student{
    private int Stud_id;
    private String Stud_name;
    Student(int Stud_id,String Stud_name){
        this.Stud_id=Stud_id;
        this.Stud_name=Stud_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Student Id=" + Stud_id +
                ", Student Name='" + Stud_name + '\'' +
                '}';
    }

    public int getStud_id() {
        return Stud_id;
    }

    public String getStud_name() {
        return Stud_name;
    }
}
class comparename implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getStud_name().compareTo(s2.getStud_name());
    }
}
class compareid implements  Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getStud_id()>s2.getStud_id()){
            return 1;
        } else if (s1.getStud_id()<s2.getStud_id()) {
            return -1;
        }
        return 0;
    }
}
public class AssignMent2 {
    public static void main(String[] args) {
        List<Student> l2 = new ArrayList<>();
        l2.add(new Student(1548,"Jema"));
        l2.add(new Student(5748,"Yanmajaya"));
        l2.add(new Student(988,"Tusharakanti"));
        l2.add(new Student(457,"Nihar Ranjan"));
        l2.add(new Student(789,"Amrutamaye"));
        l2.add(new Student(2592,"DibyaDarshini"));
        l2.add(new Student(9486,"Jema"));
        System.out.println("****************************List print******************************************");
        for(Student s:l2){
            System.out.println(s);
        }
        Comparator<Student> sn =new comparename();
        Collections.sort(l2, sn);
        System.out.println("*****************************************After sorting Name wise****************************************");
        for(Student s:l2){
            System.out.println(s);
        }
        System.out.println("****************************************After sorting id wise*********************************************");
        Comparator<Student> si = new compareid();
        Collections.sort(l2, si);
        for(Student s:l2){
            System.out.println(s);
        }
    }
}
