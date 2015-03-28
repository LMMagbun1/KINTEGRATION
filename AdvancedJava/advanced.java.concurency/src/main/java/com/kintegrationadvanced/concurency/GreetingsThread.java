package com.kintegrationadvanced.concurency;

public class GreetingsThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new GreetingsThread().start();
		
	}
	
	public void run() {
		System.out.println("Greetings from a thread");
	}

}
