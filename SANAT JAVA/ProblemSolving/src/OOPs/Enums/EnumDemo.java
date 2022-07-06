package OOPs.Enums;
enum WeeksDay{
    Sunday,Monday,TuesDay,WednesDay,ThursDay,Friday,SaturDay;
}
public class EnumDemo {
    public static void main(String[] args) {
        WeeksDay weeksDay = WeeksDay.ThursDay;
        switch (weeksDay){
            case Friday -> {
                System.out.println("this is friday");
                break;
            }
            case Monday -> {
                System.out.println("This is Monday");
                break;
            }
            case ThursDay -> {
                System.out.println("This is thaursday");
                break;
            }
            default -> System.out.println("This is default");

        }
    }
}
