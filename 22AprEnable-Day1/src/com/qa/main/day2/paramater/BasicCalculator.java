package com.qa.main.day2.paramater;

public class BasicCalculator {
	
	// Make a method that returns an int - type into the chat (dont press enter yet) 
	// This method should take in an integer and then return it
	public static int returnInt(int num) {
		return num;
	}
	
	public static String returnGreeting(String name, String timeOfDay) {
		return "Good " + timeOfDay + " " + name;
	}
	
	// Operators : Are symbols used to manipulate numerical data 
	// +  : adds things together
	// -  : subtracts numbers
	// *  : multiplies numbers 
	// /  : divides numbers (10 / 3 = 3 r1)
	// %  : modulus, returns the remainder (10 % 3 = 1)
	// <  : less than (the hungry crocodile goes for the bigger number) 3 < 10
	// >  : more than 
	// =  : make something exactly this (String text = "hello")
	// == : checking if something is something else
	
	// method that takes in two nums and adds them
	public static int addSum(int x, int y) {
		// make a new variable called result
		int result = 0;
		// result is equal to whatever the sum of x + y is
		result = x + y;
		// return result
		return result;
//		return x + y;
	}
	
	// Exercise - create a calculator class with methods that do the following: 
	// adds three nums
	// subtracts two nums
	// multiplies two nums
	// divides two nums 
	
	// takes in 3 nums and returns the sum
	public static String addThreeNums(int x, int y, int z) {
		int result = x + y + z; 
		return x + " + " + y + " + " + z + " = " + result ;
	}
	
	public static String subSum(int x, int y) {
		int result = x - y;
		return x + " - " + y + " = " + result;
	}
	
	public static int multiplySum(int x, int y) {
		int result = x * y;
		return result;
	}
	
	public static float divideSum(float x, float y) {
		float result = x / y;
		return result;
	}
	
	public static int squareSum(int x) {
		int result = x * x;
		return result;
	}
	
	public static int raisePower(int x, int y) {
		int result = (int) Math.pow(x, y); // raise x to the power of y
		// 3, 4 = 3 * 3 * 3 * 3 
		return result;
	}
	
	

}
