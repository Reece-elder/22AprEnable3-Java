package com.qa.main.day2.conditionals;

public class CommunityExer {
	
	public static String fizzBuzz(int x) {
		
		// Method that returns Fizz for multiples of 3
		// Buzz for multiples of 5
		// FizzBuzz for both 
		// The number for if neither "1", "2"
		
		// if is multiple of 3
		if(x % 3 == 0) {
			// AND if multiple of 5
			if(x % 5 == 0) {
				return "fizzbuzz: " + x;
			} else {
				return "fizz: " + x;
			}
		} else if (x % 5 == 0) {
			return "buzz: " + x;
		} else {
			return Integer.toString(x);
		}	
	}
	
	// Takes in 3 values, return the sum of all values
	// if any values aren't unique, don't add them to the total
	public static int uniqueSum(int x, int y, int z) {
		
		int total = 0; 
		
		if(x == y) {
			if(y == z) {
				// All values are the same (1,1,1)
				return total;
			} else {
				total += z;  // += : increase the variable to the left by the number on the right 
				return total;
			}
		} else if(x == z) {
			// We only should count the value of y (we've already checked if they all have the same value)
			total += y;
			return total; 
		} else if (y == z) {
			total += x;
			return total;
		} else {
			total = x + y + z;
			return total;
		}
		
	}
}
