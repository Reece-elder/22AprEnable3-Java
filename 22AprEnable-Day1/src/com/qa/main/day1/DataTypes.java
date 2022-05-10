package com.qa.main.day1;

public class DataTypes {
	
	// All the different forms of information we can use within Java 
	// String - "hello" *
	// boolean - true / false : 1 / 0 *
	// byte - small number (8 bits) 01101010 (number between 0 - 256)
	// char - "a"
	// short - smallish number -32000 - 32000 
	// int - 123 (medium length number) *
	// long - 7594730383048428 (long number)
	// float - 12.23 (has a decimal) *
	// double - 3648946390273.0840484 (long decimal) 
	
	// Within Java there are two types of data : 
	// complex   - made up of primitive data, is a collection and reference to the memory of primitive data
	// primitive - raw data, cannot be broken down further and is stored in memory 
	
	// All simple data is primitive EXCEPT for Strings 
	// Strings are collections of chars - "h","e","l","l","o"
	
	public static String textExample() {
		// return 123; // a String method CAN'T return an int
		return "123"; // A string method CAN return a number in ""
	}
	
	public static int integerExample() {
		// return "123"; Can't return a String
		return 123; 
	}
	
	// Comment block, anything inbetween /* the asterices */ will be comment
	/* Exercise - Create methods that return the following data types and prints them out: 
	Boolean
	Float
	Char
	Double
	Long	 
	 */
	
	public static boolean boolExample() {
		return true;
//		return false;
//		return 1; "DOESNT LIKE THIS"
	}
	
	public static float floatExample() {
		return 12.23f;
	}
	
	public static char charExample() {
		return 'a'; // Char is ''
	}
	
	public static double doubleExample() {
		return 674834.7494720289d;
	}
	
	public static long longExample() {
		return 67493720373020321l;
	}
	
	// An int can easily fit into a double 
	public static double forceReturn () {
		return 10; // 10 = 10.0f
	}
	
	// A float can not easily be returned as an int
	public static int forceCasting() {
		return (int) 23.78f; // convert this float into an int
	}
	
	
	
	
	

}
