package com.kintegration.tutorial.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ScanSum {

	/**
	 * @param args
	 * 
	 */
	private Object obj;
	public List<Object> stuff;
	protected List<Object> testestorne;
	public void waverIt() {
	}
	protected void maintainIt() {
	}
	private void acquireIt() {
		
	}
	public static void main(String[] args) throws IOException{
		
		double sum =0.;
		Scanner s = null;
		//Scanner //s = new Scanner(new BufferedReader(new FileReader(new File("usnumbers.txt"))));
		try {
			s= new Scanner(new File("usnumbers.txt"));
			s.useLocale(Locale.US);
			
			while(s.hasNext()) {
				if (s.hasNextDouble()) {
					sum+=s.nextDouble();
				}
				else {
					s.next();
				}
			}
		}
		finally {
			if (s!=null) {
				s.close();
			}
		}
		System.out.println(sum);
	}

}
