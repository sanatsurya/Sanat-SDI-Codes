package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Worker{
    private String name;
    private String Department;
    private int Wages;
    private int Reg_no;
    private String email;
    Worker(String name,String Department,int Wages, int Reg_no, String email){
        this.name = name;
        this.Department=Department;
        this.Wages= Wages;
        this.Reg_no= Reg_no;
        this.email= email;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", Wages=" + Wages +
                ", Registration No=" + Reg_no +
                ", Email=" + email +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return Department;
    }

    public int getWages() {
        return Wages;
    }

    public int getReg_no() {
        return Reg_no;
    }

    public String getEmail() {
        return email;
    }
}
class compare_name implements Comparator<Worker>{

    @Override
    public int compare(Worker w1, Worker w2) {

        return w1.getName().compareTo(w2.getName());
    }
}
class compare_dep implements Comparator<Worker>{

    @Override
    public int compare(Worker w1, Worker w2) {

        return w1.getDepartment().compareTo(w2.getDepartment());
    }
}
class compare_wage implements Comparator<Worker>{

    @Override
    public int compare(Worker w1, Worker w2) {
        if(w1.getWages()>w2.getWages()){
            return 1;
        } else if (w1.getWages()<w2.getWages()) {
            return -1;
        }
        return 0;
    }
}
class compare_reg implements Comparator<Worker>{

    @Override
    public int compare(Worker w1, Worker w2) {
        if(w1.getReg_no()>w2.getReg_no()){
            return -1;
        } else if (w1.getReg_no()<w2.getReg_no()) {
            return 1;
        }
        return 0;
    }
}
class compare_email implements Comparator<Worker>{

    @Override
    public int compare(Worker w1, Worker w2) {
        return w1.getEmail().compareTo(w2.getEmail());
    }
}
public class Comparator2Demo {
    public static void main(String[] args) {
        List<Worker> wr = new ArrayList<>();
        wr.add(new Worker("Sannat","CEO",5000045, 456256,"sanat@millionsdreams.com"));
        wr.add(new Worker("Jyouti prakash","Team Lead Accounting",20000,452852,"jyoutiprakash@millionsdream.com"));
        wr.add(new Worker("Bishnu Prakash","Managing core peope",15000,458257,"bishnumangaraj@millionsdream.com"));
        wr.add(new Worker("Biswa ranjan","Managing Software teams",1355,54786,"bishnumangaraj@millionsdream.com"));
        wr.add(new Worker("Satya Sarathi","Managing Director",78500,68247,"bishnumangaraj@millionsdream.com"));
        wr.add(new Worker("Lula","Mechanical Worker",15000,87952,"bishnumangaraj@millionsdream.com"));
        wr.add(new Worker("Amrit","Server Side Programmer",7854,986324,"bishnumangaraj@millionsdream.com"));
        for(Worker w:wr){
            System.out.println(w);
        }
        Comparator<Worker> cd = new compare_dep();
        Collections.sort(wr,cd);
        System.out.println("********************************After Shorting Department**************************");
        for(Worker w:wr){
            System.out.println(w);
        }
        Comparator<Worker> cn = new compare_name();
        Collections.sort(wr,cn);
        System.out.println("******************************After Shorting Name************");
        for(Worker w:wr){
            System.out.println(w);
        }
        Comparator<Worker> cr= new compare_reg();
        Collections.sort(wr, cr);
        System.out.println("***********After shorting registration no******************");
        for(Worker w:wr){
            System.out.println(w);
        }
        Comparator<Worker> ce = new compare_email();
        System.out.println("*********************Compare email wise********************");
        for(Worker w:wr){
            System.out.println(w);
        }
        Comparator<Worker> cwag = new compare_wage();
        System.out.println("*******************Compare wages wise**************************");
        Collections.sort(wr,cwag);
        for(Worker w:wr){
            System.out.println(w);
        }
    }
}
