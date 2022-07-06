package MoshUltimateTwo.CLASSES;


public class DemoClass {
    public String name;// Filed
    public void setName(String name){
        this.name=name;
        System.out.println(name);
    }
    public void clear(){
        name="";
    }

    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.setName("My name");
        obj.clear();
        System.out.println(obj.name+"name here");
    }
}
