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
	
	//	moneySpend(300, 23.50f, 40);
	// Exercise - Create a method that takes in 3 numbers (starting money, expenses, limit)
	// Use a loop to subtract the expenses from your starting money, 
    // when your starting money goes underneath your limit, stop the loop and print "STOP SPENDING MONEY!!"

	// for loop 
	public static void forLoopDemo() {
		
		// loops through a block of code for a pre determined amount of time 
		// - initialisation (the initial value to set our counter) 
		// - condition (the query we are waiting for to stop the loop)
		// - command (what our loop is doing)
		// - iterator (how we are changing our counting value) (i += 1 = 1++) (i-- : increment or decrement by 1)

		
		// Basic for loop that counts from 1 - 10 
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		// for loop to count down from 10 to 4
		for(int x = 10; x >= 4; x--) {
			System.out.println("Current number: " + x);
		}
		
		// ++ / -- they change the value by 1
		// x += 4
		
		for(float j = 7f; j < 234f; j += 13.67f) {
			System.out.println("Value of J: " + j);
		}
		
		for(int l = 2; l <= 15; l +=2) {
			// When l = 6, print out something different
			if(l == 6) {
				System.out.println("Value of l is 6!!! :D");
			} else {
				System.out.println(PrintClass.helloThere(l));
			}
		}
	}
	
	// When you know how many times a loop should run - for loop 
	// When you don't know how many times it should run - while loop 
	// Use a do while if you need to (need to run the command atleast once) - do while
	
}
