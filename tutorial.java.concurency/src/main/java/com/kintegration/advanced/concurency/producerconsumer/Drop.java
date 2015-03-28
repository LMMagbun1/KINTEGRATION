package com.kintegration.advanced.concurency.producerconsumer;

public class Drop {
	
	// Message sent from producer
	// to consumer.
	private String message;

	// True if consumer should wait
	// for producer to send message,
	// true if producer should wait for
	// false to retrieve message.
	private boolean empty = true;
	
	public synchronized String take() {
		// Wait till a message is available
		while(empty) {
			try {
				wait();
			}
			catch(InterruptedException e) {}
		}
		// Toggle status.
		empty=true;
		// Notify producer that status has changed.
		notifyAll();
		return message;
	}
	
	public synchronized void put(String message) {
		// Wait until message has been retrieved.
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		empty = false;
		
		//Store message
		this.message = message;
		
		// Notify consumer that status has changed.
		notifyAll();
	}
}
