package com.kintegration.tutorial.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Hello world!
 *
 */
public class CopyLines 
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        boolean b = false;
        File file = new File("xanadu.txt");
        System.out.println(file.getCanonicalPath());
        try {
        	inputStream = new BufferedReader(new FileReader(file));
        	outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));
        	
        	String line;
        	while ((line=inputStream.readLine()) != null) {
        		outputStream.println(line);
        	}
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
