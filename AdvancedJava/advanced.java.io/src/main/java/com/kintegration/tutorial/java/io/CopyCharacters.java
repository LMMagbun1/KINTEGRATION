package com.kintegration.tutorial.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class CopyCharacters {
	
	public static void main(String [] args) throws IOException {
		BufferedReader inputStream =
				new BufferedReader(new FileReader(new File("xanadu.txt")));
		PrintWriter outputStream =
				new PrintWriter(new FileWriter(new File("characteroutput.txt")));
		
		PrintStream outputBytes =
				new PrintStream(new File("byteoutput.txt"));
		
		try {
			for (String l = inputStream.readLine(); l!=null;) {
				outputStream.println(l);
				outputBytes.println(l);
				l=inputStream.readLine();
			}
		}
		
		finally {
			if (inputStream!=null) {
				inputStream.close();
			}
			if (outputStream!=null) {
				outputStream.close();
			}
		}
		
	}

}

