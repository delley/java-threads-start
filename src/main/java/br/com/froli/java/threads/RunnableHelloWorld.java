package br.com.froli.java.threads;

public class RunnableHelloWorld implements Runnable {

	@Override
	public void run() {
		System.out.println("Parallel Hello World!");
		System.out.println("I'm the thread: " + Thread.currentThread().getName());
	}

}
