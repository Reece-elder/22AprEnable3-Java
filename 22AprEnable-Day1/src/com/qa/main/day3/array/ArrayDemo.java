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
		
		
	}

}
