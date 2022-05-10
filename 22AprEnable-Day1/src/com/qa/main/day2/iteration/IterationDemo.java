package com.qa.main.day2.iteration;

public class IterationDemo {
	
	// Iteration - Process of running a block of code multiple times 
	// Large set of data, run the same function across each piece of data - 
	// Often we will need to do the same commands to multiple pieces of data 
	// Rather than writing one method 100x, write it once 
	
	// Print out all of the numbers from 1 - 20 - syso("1"); syso("2");.. 
	
	public static void whileDemo() {
		
		// Three different main types of loop 
		// While    - Checks a query, if it is true it does something and keeps doing until query is false
		// Do While - Does something THEN checks if the query is true, and will keep repeating
		// For Loop - Does something for a known amount of loops 
		
		int counter = 0; 
		
		System.out.println("Before starting Loop");
		// While the value of counter is less than 10 - exactly the same as in if statement
		while(counter < 10) {
			counter += 1;  // increments counter by 1
			System.out.println("Counter: " + counter);
		}
		System.out.println("--------loop end---------");
		
		// All loops follow some type of numerical query to keep looping around 
		
		String colour = "blue";
		
		// While our value of colour == blue
		while(colour == "blue") {
			colour = "red";
			System.out.println("Colour: " + colour);
		}
		System.out.println("--------loop end---------");
		
	}
	
	
	public static void doWhileDemo() {
		
		// do while loop will always run the command once, then check the query 
		
		boolean query = false;
		
		do {
			System.out.println("This will always run!");
		} while(query); // query == true
		
		int hoursLeft = 9; 
		
		do { 
			System.out.println("Hours left before finishing work: " + hoursLeft);
			hoursLeft -= 1; // subtract 1 from hours left 
		} while(hoursLeft > 0);
		
	}

}
