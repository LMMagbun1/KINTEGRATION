package com.kintegration.tutorial.java.io;

import java.util.Calendar;

public class FormatIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 2;
		double r = Math.sqrt(i);
		Calendar c = Calendar.getInstance();
		
		System.out.format("The square root of %d is %f.%n", i, r);
		System.out.format("This month is the month of %tB", c);
	}

}
