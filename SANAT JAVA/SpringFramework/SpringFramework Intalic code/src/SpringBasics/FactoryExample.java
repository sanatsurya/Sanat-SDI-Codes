package SpringBasics;

import javax.security.auth.Subject;

interface Subjects{
    public void SubjectName(String name);
}
class Physics implements Subjects{

    @Override
    public void SubjectName(String name) {

    }
}
class Chemistry implements  Subjects{

    @Override
    public void SubjectName(String name) {

    }
}
class Mathematics implements Subjects{

    @Override
    public void SubjectName(String name) {

    }
}
class Zoology implements Subjects{

    @Override
    public void SubjectName(String name) {

    }
}
class Botany implements Subjects{

    @Override
    public void SubjectName(String name) {

    }
}
class FactorySubject{
    public  Subject subject(String subjname){
        try {
            if (subjname.equals("physics")){
            }
        }
        catch (RuntimeException e){

        }
        return null;
    }
}
public class FactoryExample {
    public static void main(String[] args) {

    }
}
