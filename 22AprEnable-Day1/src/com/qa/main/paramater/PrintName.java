package com.qa.main.paramater;

public class PrintName {
	
	// Method that returns a String saying "Hello name!"
	// The () next to the method name can be used to pass in a value
	// returnGreeting("Pip", "Tony", 12);
	public static String returnGreeting(String name, String name2, int number) {
//		String name = "Daniela"; // name = "Daniela"
		// I don't want it to return 'name' I want it to return the name I choose
		// Use something called paramaters - My method has a stand in value that I can choose
//		return "Hello name!";
		return "Hello " + name; // name = value I want name to be
	}

}
