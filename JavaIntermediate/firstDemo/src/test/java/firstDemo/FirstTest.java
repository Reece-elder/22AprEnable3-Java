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
		String name = "";
		
		// Act - Running what I want to test
		name = "Reece";
		
		// Assert - Checking if it returned what I expect
		// Is name (variable) equal to Reece
		Assertions.assertEquals("Rhys", name);
	}

}
