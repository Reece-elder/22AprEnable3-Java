package firstDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Testing is written in Java, using the same rules and codes (loops, if, for, boolean etc) 
// Testing does NOT USE a main method
// Every method labelled as a test will run

public class FirstTest {
	
	// Test methods don't generally return anything
	@Test
	public void printNameTest() {
		
		// Arrange - pulling all methods / variables I need
		String name = ""; // name is empty
		
		// Act - Running what I want to test
		name = "Reece";
		
		// Assert - Checking if it returned what I expect
		// Is name (variable) equal to Reece
		Assertions.assertEquals("Reece", name);
	}
	
	// Testing if 2 + 2 is equal to 4
	// You are checking if something gives you a value you expect to be there
	// (Not testing stuff we can't expect a value)    - DON'T DO THIS
	// Changing methods to allow us to expect a value - DO THIS
	
	// Testing if (739329 * 4728) / 56 - Not a good test because I have no idea what number to expect

	// Good practice if test methods end in Test (but not always necessary)
	@Test // Tell Eclipse that this method is a test
	public void twoPlusTwoTest() {
		
		// Arrange - Variables, methods I may need
		int num1 = 2;
		int num2 = 2; 
		int result;   // What my sum is going to equal
		
		// Act - Doing the thing I am testing
		//   4 =    2 +    2
		result = num1 + num2;
		
		// Assert - Checking if my act returns what I expect
		Assertions.assertTrue(4 == result); // If statement, giving it a query
		Assertions.assertEquals(4, result); // Using assertEquals (The simplest to use)
		Assertions.assertNotEquals(200, result); // Checking if it is not equal (200 is not equal to 4)
		// Your method can return 1 of 10 different exact strings ("a","b","c"..) 
		// Use not equals to validate it does not return one of the 10 strings
		
		// 5 does not equal result == true (I want it to return false)
		// 5 does equal result == false
		// 4 does not equal result == false
		Assertions.assertFalse(4 != result); // Testing error messages in methods 
	}
	
	// Test that 5 - 1 = 4
	@Test
	public void subtractTest() {
		
		// Arrange
		int num1 = 5;
		int num2 = 1;
		int result;
		
		// Act 
		result = num1 - num2;
		
		// Assert
		Assertions.assertEquals(4, result);
		
	}
	
}
