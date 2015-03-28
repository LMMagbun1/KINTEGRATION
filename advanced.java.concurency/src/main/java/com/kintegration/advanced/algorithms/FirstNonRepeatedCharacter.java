package com.kintegration.advanced.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FirstNonRepeatedCharacter {
	
	public static char firstNonRepeated(String str) {
		
		char EMPTY_CHAR = '\u0000';
		
		Map<String, AtomicInteger> charInString = new HashMap<String, AtomicInteger>();
		
		System.out.println("Empty character is: " + EMPTY_CHAR);
		
		// Create a map structure with the characters as key and the occurences as value
		
		for (int i = 0; i < str.length(); i++) {
			String key = String.valueOf(str.charAt(i));
			AtomicInteger value = charInString.get(key);
			if (value == null) {
				value = new AtomicInteger(1);
				charInString.put(key, value );
			}
			else {
				value = charInString.get(key);
				value.incrementAndGet();
				charInString.put(key, value);
			}
		}
		
		// Now find the first non repeated character by traversing the map using the string.
		
		for (int i=0; i < str.length(); i++) {
			String key = String.valueOf(str.charAt(i));
			AtomicInteger value = charInString.get(key);
			if (value.intValue() == 1) return key.charAt(0);
		}
		
		return EMPTY_CHAR;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int overFlow = 2147483647 * 2;
		System.out.println("Overflown int is: " + overFlow);
		String s1 = "Jason";
		String s2 = "Jason";
		if (s1==s2) System.out.println("The two strings with value Jason are the same");
		if (s1==s2) System.out.println("The two strings with value Jason are the same again!!!");
		Integer lafoutaise = 11;
		System.out.format(" How big is la foutaise: %d%n", lafoutaise);
		char c = firstNonRepeated(args[0]);
		System.out.println("First non repeated character is: " + c);

	}

}
