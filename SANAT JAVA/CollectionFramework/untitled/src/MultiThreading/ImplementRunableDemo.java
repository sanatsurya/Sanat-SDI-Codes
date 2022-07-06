package MultiThreading;
class DownloadFileTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Downloading a : " + Thread.currentThread().getName());
    }
}
public class ImplementRunableDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            DownloadFileTask downloadFileTask = new DownloadFileTask();
            Thread thread = new Thread(downloadFileTask);
            thread.start();
        }
    }
}
