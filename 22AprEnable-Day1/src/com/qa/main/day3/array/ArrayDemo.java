package com.qa.main.day3.array;

public class ArrayDemo {
	
	// Arrays are complex data types that store multiple values as a single variable
	// An array (in Java) can only store one data type (array of ints, chars, floats, Strings..) 
	// Strings are arrays of 'c''h''a''r''s'
	
	// Arrays in Java are immutable, they cannot change length / size or change the type of data they store 
	// A train can carry passengers OR Cargo, it can't change length mid journey 
	// BUT different passengers or cargo can join
	
	public static void arrayExample() {
		
		// Make an array of fruits (String)
		// Data type of the variable [] - int[] (array of integers)
		// Name of our array 
		// = {"with", "your", "data"}
		String[] fruitArray = {"kiwi", "melon", "banana", "grape", "mango"};
		
		// Printing out the array
		// Prints out the reference to the memory of this object, 
		System.out.println(fruitArray);
		
		// indexing - ordering and grabbing values from an array 
		// index numbers start from 0 and go up
		// If I want to grab "kiwi" it is index 0, "banana" = index 2
		
		// Print out the 1st index value of our array fruitArray
		System.out.println(fruitArray[1]);
		System.out.println(fruitArray[0]);
		System.out.println(fruitArray[3]);
//		System.out.println(fruitArray[5]);
		
		fruitArray[3] = "blueberry";
		System.out.println(fruitArray[3]);
		
		System.out.println("******************************");
		// You can use a loop to print out the entire array
		// Our query is for less than the length of the array
		for(int i = 0; i < 5; i++) {
			// fruitArray[5] - gives us an error because there are only 5 elements
			System.out.println(fruitArray[i]); // Print out the ith value (0, 1, 2, 3, 4, 5)
		}
		
		// prints out the int length (amount of elements) in this array
		System.out.println(fruitArray.length);
		
		// using fruitArray.length
		for(int i = 0; i < fruitArray.length; i++) {
			System.out.println(fruitArray[i]); // Print out the ith value (0, 1, 2, 3, 4, 5)
		}
		
		// Exercise - Create an array that holds 5 colours 
		// Print out all of the colours in the array with a loop
		// Use an if statement to print out "My favourite colour" when you get to your favourite colour in the array
		
		// Outside of the loop, update 2 of the colours using the index value 
	}
	
	public static void colourExercise() {
		
		// Making our colour array
		String[] colourArray = {"Purple", "Red", "Blue", "TeAl", "Green"};
		
		colourArray[4] = "Lime";
		colourArray[1] = "Maroon";
		
		// Length counts from 1, so the final index of an array will always be length - 1 
		for(int i = 0; i < colourArray.length; i++) {
			
			String colourCheck = colourArray[i].toLowerCase();
			System.out.println(colourCheck);
			
			// Use an if statement to check the value and compare 
			// use String.equals("string to compare") when using if statements 
			if(colourCheck.equals("teal")) {
				System.out.println(colourArray[i] + " is my fav colour!");
			} else {
				System.out.println(colourArray[i]);
			}
			
		}
		
	}

}
