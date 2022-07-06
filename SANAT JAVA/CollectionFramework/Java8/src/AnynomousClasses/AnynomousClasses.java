package AnynomousClasses;

public class AnynomousClasses {
    @FunctionalInterface
     interface Printer{
        void scan(String message);
    }
    static void Show(){
        Printer printer = new Printer() {
            @Override
            public void scan(String message) {
                System.out.println("The objectives are print here" + message);
            }
        };
        printer.scan("The Scanned message is print here" );
    }

    public static void main(String[] args) {
        Show();
    }



}
