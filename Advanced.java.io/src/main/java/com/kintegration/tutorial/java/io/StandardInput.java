package com.kintegration.tutorial.java.io;
import java.util.Scanner;


public class StandardInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Please enter two values separated by space: ");
		Scanner in =
				new Scanner(System.in);
		
		int firstNumber = in.nextInt();
		int secondNumber = in.nextInt();
		String lane1=in.next();
		String lane2=in.next();
		
		System.out.println("The following numbers were read: " 
		+ firstNumber + " " + secondNumber);
		System.out.println("The first lane is: " + lane1);
		System.out.println("The second lane is: " + lane2);

	}

}
