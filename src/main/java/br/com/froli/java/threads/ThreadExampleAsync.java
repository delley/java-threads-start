package br.com.froli.java.threads;

public class ThreadExampleAsync {
	public static void main(String[] args) {
		Runnable parallel = new RunnableHelloWorld();
		Thread t1 = new Thread(parallel);
		t1.start();
		System.out.println("Main thread: " + Thread.currentThread().getName());
	}
}
