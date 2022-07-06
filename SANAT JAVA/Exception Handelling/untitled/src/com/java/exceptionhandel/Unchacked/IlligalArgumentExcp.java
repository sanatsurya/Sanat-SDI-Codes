package com.java.exceptionhandel.Unchacked;
import java.io.*;
public class IlligalArgumentExcp {
    public static void main(String[] args) {
        {

            // Create a simple Thread by
            // implementing Runnable interface
            Thread t1 = new Thread(new Runnable() {
                public void run()
                {
                    try {
                        // Try to make the thread sleep for -10
                        // milliseconds
                        Thread.sleep(-10);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(
                            "Welcome To GeeksforGeeks!");
                }
            });

            // Name the thread as "Test Thread"
            t1.setName("Test Thread");

            // Start the thread
            t1.start();
        }

    }

}
