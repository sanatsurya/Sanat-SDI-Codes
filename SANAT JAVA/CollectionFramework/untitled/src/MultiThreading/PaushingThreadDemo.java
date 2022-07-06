package MultiThreading;
class DownloadFile implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("The current thread is " + Thread.currentThread().getName());
            Thread.sleep(5000);//This is set the
        }
        catch (Exception e){
            e.getStackTrace();
        }
        System.out.println("Download Complete " + Thread.currentThread().getName());//After Complete previous thread this thread will begin.
    }

}
public class PaushingThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new DownloadFile());
            thread.start();
        }

    }
}
