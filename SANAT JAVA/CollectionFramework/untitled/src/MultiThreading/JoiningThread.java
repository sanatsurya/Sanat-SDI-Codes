package MultiThreading;

public class JoiningThread {
    public static void main(String[] args) {
        System.out.println("Th thread name is " + Thread.currentThread().getName() );
        Thread thread = new Thread(new DownloadFile());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("The file is moved to directory");
    }
    static class DownloadFile implements Runnable{

        @Override
        public void run() {
            try{
                System.out.println("The file is Scanning");
                Thread.sleep(5000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("The file is Ready to Download");
        }
    }
}
