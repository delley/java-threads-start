package br.com.froli.java.threads;

public class ThreadExerciseB {
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableHelloWorld());
		Thread t2 = new Thread(new RunnableHelloWorld());
		Thread t3 = new Thread(new RunnableHelloWorld());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("End execution!");
	}
}
