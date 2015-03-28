package com.kintegration.tutorial.java.io;

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

public class Password {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		Console c = System.console();
		
		if (c==null) {
			System.err.println("No such console.");
			System.exit(1);
		}
		
		String login = c.readLine("Enter your login: ");
		char [] oldPassword = c.readPassword("Enter your old password: ");
		if (verify(login, oldPassword)) {
			boolean noMatch;
			
			do {
				char [] newPassword1 = c.readPassword("Enter your new password: ");
				char [] newPassword2 = c.readPassword("Enter new password again: ");
				noMatch = !Arrays.equals(newPassword1, newPassword2);
				
				if (noMatch) {
					c.format("Password don't match. Try again.%n");
				}
				else {
					change(login, newPassword1);
					c.format("Pawword for %s changed.%n");
				}
				Arrays.fill(newPassword1, ' ');
				Arrays.fill(newPassword2, ' ');
				
			}while (noMatch);
		}
		Arrays.fill(oldPassword, ' ');
	}
	
	static boolean verify(String login, char [] password) {
		// This method always returns
		// true in this example.
		// Modify this method to verify
		// password according to your rules.
		return true;
		
	}
	
	static void change(String login, char[] password) {
		// Modify this method to change
		// password according to your rules.
	}

}
