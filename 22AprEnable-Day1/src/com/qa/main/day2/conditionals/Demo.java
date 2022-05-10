package com.qa.main.day2.conditionals;

public class Demo {
	
	// Conditionals - Methods of branching our code dependent on input values 
	// IF ELSE statements - Take in a query, and do 'something' dependant on the query 
	
	public static void basicExample() {
		
		// Method that turns kettle off if water is boiling 
		boolean kettleOn = true; 
		int waterTemp = 110; 
		
		// Statement to check if water temp is higher than 90
		if(waterTemp > 90) {  // If water temp is higher than 90
			kettleOn = false; // turn the kettle off
			System.out.println("Print me if the if statement triggers!");
		} else { // code in the else {} runs after the if {} block IF the query isn't true
			System.out.println("Kettle isn't boiled yet :( ");
		}
		
		// print out the value of kettle on
		System.out.println("The kettle is on: " + kettleOn);
		
	}
	
	public static void nestingIfElse() {
		
		// Simple if else is either true or false 
		boolean tails = true; 
		
		// When checking the exact value use ==
		if(tails == true) {
			System.out.println("tails wins!");
		} else {
			System.out.println("heads wins");
		}
		
		// If else statement to check what day it is
		String day = "literally anything else";
		
		
		if(day == "Mon") {
			System.out.println("It's monday!");
		} else if (day == "Tue") {
//			System.out.println("It literally could be any of the days apart from mon.. "); // BAD DESIGN
			System.out.println("It's tuesday!");
		} else if (day == "Wed") {
			System.out.println("It's wednesday!");
		} else if (day == "Thu") {
			System.out.println("It's Thursday");
		} else if (day == "Fri") {
			System.out.println("It's Friday");
		} else { // Serves as a default and catches any value 
			System.out.println("It's the weekend!");
		}
		
	}

}
