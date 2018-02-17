package br.com.froli.java.threads.interrupt;

public class InterruptRunnable implements Runnable {

	@Override
	public void run() {
		boolean interrupt = false;
		while (!interrupt) {
			interrupt = Thread.interrupted();
			System.out.println(">INTERRUPT flag: " + interrupt);
		}
		System.out.println("INTERRUPT flag: " + interrupt);
		System.out.println("Thread " + Thread.currentThread().getName() + " is DONE!");
	}

}
