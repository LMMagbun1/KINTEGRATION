package com.kintegrationadvanced.concurency;

/**
 * Hello world!
 *
 */
public class GreetingsRunnable implements Runnable
{
    public static void main( String[] args )
    {
        new Thread(new GreetingsRunnable()).start();
    }

	public void run() {
		System.out.println("Greetings from a thread!!!");
	}
}
