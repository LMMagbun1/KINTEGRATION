package com.kintegration.tutorial.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		Scanner s = null;
		
		try {
			s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

			for (; s.hasNext(); ) {
					System.out.println(s.next());
			}
		}
		finally {
			if (s!=null) {
				s.close();
			}
		}
	}

}
