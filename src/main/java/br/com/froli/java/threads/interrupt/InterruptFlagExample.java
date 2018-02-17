package br.com.froli.java.threads.interrupt;

public class InterruptFlagExample {

	public static void main(String[] args) {
		Runnable runnable = new InterruptRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
		for (int i = 0; i < 1_000_000; i++) {
			// Delay the main thread so that thread t1 can run a few times!
		}
		
		t1.interrupt();
		System.out.println("Thread " + Thread.currentThread().getName() + " is DONE!");
	}

}
