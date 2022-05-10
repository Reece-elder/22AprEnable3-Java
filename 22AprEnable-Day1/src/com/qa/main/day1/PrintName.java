package com.qa.main.day1;

public class PrintName {
	
	// Method that returns a String saying "Hello name!"
	// The () next to the method name can be used to pass in a value
	// returnGreeting("Pip", "Tony", 12);
	
	// Exercise - Either make a new method (or convert old one) to return "Hello <your name>"
	// Stretch goal - Make a method that returns "Hello <your name> it is <day of the week>"

	// String - returns a String
	// "123"  - is a string -> "my name is reece, my fav number is 36"
	public static String returnGreeting(String name) {
//		String name = "Daniela"; // name = "Daniela"
		// I don't want it to return 'name' I want it to return the name I choose
		// Use something called paramaters - My method has a stand in value that I can choose
//		return "Hello name!";
		return "Hello " + name; // name = value I want name to be
	}

}
