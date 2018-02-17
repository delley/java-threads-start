package br.com.froli.java.threads;

public class ThreadExampleAsync2 {

	public static void main(String[] args) {
		class ParallelHello implements Runnable {
			@Override
			public void run() {
				System.out.println("Parallel Hello!");
			}
			
		}
		
		Thread t1 = new Thread(new ParallelHello());
		t1.start();
		System.out.println("Main thread: " + Thread.currentThread().getName());
	}

}
