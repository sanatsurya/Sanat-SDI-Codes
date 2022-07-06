package MultiThreading;
class CrThread extends Thread{
    public void run(){
        System.out.println("Current Thread is: " + Thread.currentThread().getName());
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            CrThread t1 = new CrThread();
            t1.start();
        }
    }
}
