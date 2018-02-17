package br.com.froli.java.threads;

public class ThreadExampleSync {

	public static void main(String[] args) {
		Runnable parallel = new RunnableHelloWorld();
		parallel.run();
		System.out.println("Main thread: " + Thread.currentThread().getName());
	}

}
