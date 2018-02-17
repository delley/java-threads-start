package br.com.froli.java.threads;

public class ThreadExampleAsync4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> System.out.println("Parallel Hello!"));
		t1.start();
		System.out.println("Main thread: " + Thread.currentThread().getName());
	}

}
