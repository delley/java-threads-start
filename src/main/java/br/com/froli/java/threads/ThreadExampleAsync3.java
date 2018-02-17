package br.com.froli.java.threads;

public class ThreadExampleAsync3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Parallel Hello!");
			}
		});
		t1.start();
		System.out.println("Main thread: " + Thread.currentThread().getName());
	}

}
