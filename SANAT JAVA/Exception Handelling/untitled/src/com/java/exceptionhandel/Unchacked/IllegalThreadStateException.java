package com.java.exceptionhandel.Unchacked;

class IllegalThreadStateException {

	public void run() // Entry point of new thread
	{

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String... ar) {
		Thread newTh = new Thread();
		Thread th = new Thread(newTh, "Thread2"); // Calling Thread's constructor & passing the object
		// of class that implemented Runnable interface
		// & the name of new thread.

//Stating the thread(Thread2).
		th.start();

		try {
			System.out.println("Main Thread is going to sleep");
			Thread.sleep(3000); // Making main thread sleep for 3000ms / 3 seconds
			System.out.println("Main thread is awakened");
		} catch (Exception e) {
			System.out.println(e);
		}

//Calling start() method on a dead thread, causing IllegalStateException
		th.start();

//This won't be printed because the main thread is halted by IllegalStateException
		System.out.println("Main Thread");
	}
}