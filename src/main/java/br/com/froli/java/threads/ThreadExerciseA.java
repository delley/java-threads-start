package br.com.froli.java.threads;

public class ThreadExerciseA {

	public static void main(String[] args) {
		Runnable hello = new RunnableHelloWorld();
		Thread t1 = new Thread(hello);
		Thread t2 = new Thread(hello);
		Thread t3 = new Thread(hello);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("End execution!");
	}

}
