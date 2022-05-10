package com.qa.main.day2.conditionals;

public class Calc {
	
	// Determine what data you will be returning, and do that
	public static int subSum(int x, int y) {
		
		// result will be negative if x < y
		if(x < y) {
			System.out.println("You can't subtract that, negative error"); ;
			return 0;
		} else {
			int result = x - y;
			System.out.println(multFive(result)); // Run the multFive method passing in our result value
			return result; // returning a string with concatenation
		}
	}
	
	public static int multiplySum(int x, int y) {
		
		if(y == 10) {
			System.out.println("Too easy to multiply!");
			return 0;
		} else {
			int result = x * y;
			return result;
		}
	}
	
	public static float divideSum(float x, float y) {
		
		if(y == 0) {
			System.out.println("You can't divide by 0!");
			return 0f;
		} else {
			float result = x / y;
			return result;
		}
		
		// If I check if x / y at this stage.. we've already divided x by 0 
	}
	
	// Checking if a number is odd or even 
	public static void oddEven(int x) {
		if(x % 2 == 0) { // Check if the remainder of x / 2 == 0
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}
	
	// Telling us if value is a multiple of 5
	public static String multFive(float x) {
		
		if(x % 5 == 0f) {
			return "Multiple of five!";
		} else {
			return "Not a multiple of five!";
		}
		
	}
	
	

}
