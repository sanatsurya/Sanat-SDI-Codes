package MultiThreading;

public class InterruptedThread {
    public static void main(String[] args) {
        System.out.println("The name of thread is " + Thread.currentThread().getName());
        Thread thread = new Thread(new DownloadFile());
        thread.start();
        try{
            thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
        System.out.println("Download file from " + Thread.currentThread().getName());
    }
    static class DownloadFile implements Runnable{

        @Override
        public void run() {
            System.out.println("The thread name is " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if(Thread.currentThread().isInterrupted()){
                    return;
                }
                System.out.println("The download file is " + i);
            }
            System.out.println("The Download is Completed");
        }
    }
}
