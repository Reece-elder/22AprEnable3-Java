package com.qa.calculatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.qa.calculator.BasicCalculator;

// BasicCalculatorTest Class will be testing all of the methods for BasicCalculator

public class BasicCalculatorTest {
	
	// Because our caclulator is instanced I need to do..
	// create a calculator object
	BasicCalculator calc = new BasicCalculator();
	
	// Testing the addSum method 
	// returns an int, which is x + y added together
	@Test
	public void addSumTest() {
		
		// Arrange
		int num1 = 7;
		int num2 = 4;
		int result;
		
		// Act 
		// result = Object.methodWeAreTesting();
		result = calc.addSum(num1, num2);
		
		// Assert
		Assertions.assertEquals(11, result);
		
	}
	
	// Coverage works with lines and instructions
	// You should aim for 80% coverage 
	// Testing all of the methods you wrote 
	// NASA 100% coverage 
	// Startup Indie snapchat clone 50 - 60% coverage
	
	@Test
	public void higherTest() {
		// Arrange
		String result;
		
		// Act 
		// If num is higher 10, should return "Higher"
		result = calc.higherLower(15);
		
		// Assert
		Assertions.assertEquals("Higher!", result);
	}
	
	@Test
	public void lowerTest() {
		// Arrange
		String result;
		
		// Act 
		// If num is higher 10, should return "Higher"
		result = calc.higherLower(7);
		
		// Assert
		Assertions.assertEquals("Lower!", result);
	}
	
	
	public void equalTest() {
		// Arrange
		String result;
		
		// Act 
		// If num is higher 10, should return "Higher"
		result = calc.higherLower(10);
		
		// Assert
		Assertions.assertEquals("Equal to 10 :)", result);
	}
	@Test
	public void equalTest2() {
		// Chucking in a random number and doing nothing
		calc.higherLower(32);
		
		// Forcing an assertion of true
		Assertions.assertTrue(true);
		
		// Important that tests are meaningful and doing
		// something useful with the data 
		
	}
	
	// Exercise - Go through an existing exercise (iterations, params, conditionals etc) 
	// Copy and paste the existing methods into your Maven project (make new class) 
	// Make sure the methods return something, and test them 

}
