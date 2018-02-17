package br.com.froli.java.threads.sleep;

public class SleepExample {

	public static void main(String[] args) {
		Runnable r1 = new SimpleDelay(2000);
		Runnable r2 = new SimpleDelay(5000);
		
		new Thread(r1).start();
		new Thread(r2).start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ignored) { }
		System.out.println("Thread " + Thread.currentThread().getName() + " is DONE!");
	}

}
