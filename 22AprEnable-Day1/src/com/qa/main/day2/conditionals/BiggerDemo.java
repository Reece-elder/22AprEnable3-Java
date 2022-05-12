package com.qa.main.day2.conditionals;

public class BiggerDemo {
	
	// method doesnt return anything
	// takes in a boolean called query
	public static void boolDemo(boolean query) {
		
		// if statement to check if query is true or not
		if(query == true) { // if() takes in a query and either returns true or false 
			System.out.println("Query is true!");
		} else if (query == false) {
			System.out.println("Query is false!");
		}
		
		// if query == true do this thing
		if(query) { 
			System.out.println("Query is still true");
		}
		
		// != : not equals 
		if(query != true) {
			System.out.println("Query is definitely false");
		}
		
		// if query is not true
		if(!query) {
			System.out.println("Query is still very much false");
		}
		
	}
	
	public static void complexIfElse(int num, String colour) {
		
//		int num = 10;
//		String colour = "red";
		
		// If statement that Checks if num is greater than 8 and if colour is "red"
		
		if(num > 8) {
			System.out.println("num is greater than 8, but I don't know the value of colour");
		}
		
		if(colour == "red") {
			System.out.println("colour is red, but I don't know if num > 8");
		}
		
		// && - AND operator, checks if both queries are true 
		// || - OR operator , checks if either queries (or both) are true
		
		// if num is greater than 8 AND colour is "red"
		
		if(num > 8 && colour == "red") {
			// how many other possible conditions are there? 
			// neither are true, colour = true, num = true
			System.out.println("1: num greater than 8 and colour is red");
		} else if (num > 8) {
			System.out.println("2: Num is greater than 8 AND colour is not red");
		} else if (colour == "red") {
			System.out.println("3: colour is red AND num is not greater than 8");
		} else {
			System.out.println("4: Colour is not red AND num is not greater than 8");
		}
		
		// if num is less than 7 OR if colour is blue
		if(num < 7 || colour == "blue") {
			System.out.println("num is less than 7 OR colour is blue OR they are both true");
			
			// Nesting statements, we can put an if statement INTO an if statement 
			// Check what condition is true
			if(num < 7 && colour == "blue") {
				System.out.println("both are true");
			} else if (num < 7) { 
				// we know colour is not blue, otherwise the above if would have triggered
				System.out.println("num is less than 7 and colour is not blue ");
			} else {
				// we know colour is blue and num is not less than 
				// 7 otherwise above if statements would have triggered
				System.out.println("num is not less than 7 and colour is blue");
			}
		} else {
			System.out.println("Neither num is less than 7 and colour is not blue");
		}
		
	}

}
