package com.java.strix;

public class Formatter {

	
	public static String makePrettyLookingString(String input) {
		return input.toLowerCase();
	}
	
	public static String makePrettyLookingString(String input, String format) {
		return String.format(format, input, 00);
	}
	
}
