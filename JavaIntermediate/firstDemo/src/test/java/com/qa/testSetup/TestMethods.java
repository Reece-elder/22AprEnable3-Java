package com.qa.testSetup;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

// Putting this at the top lets your beforeAll and afterAll be instanced
@TestInstance(Lifecycle.PER_CLASS)
public class TestMethods {
	
	// Rules about testing: 
	// 1) All methods should do one thing, and return one thing 
	// 2) All tests should run regardless of any other tests 
	//		If test B, requires test A to run first.. it is not a valid test
	
	String testData = "blank";
	
//	@Test
	public void testA() {
		
		testData = "test A complete";
		Assertions.assertTrue(true);
	}
	
//	@Test
	public void testB() {
		
		// our result string is equal to whatever testA changes it to
		String result = testData;
		Assertions.assertEquals("test A complete", result);
	}
	
	// When writing tests we need some setup to be done, and some teardown to be done 
	// @BeforeAll  - Runs once before all tests (must be static)
	// @AfterAll   - Runs once at the end of the test suite (must be static)
	// @BeforeEach - Runs before each test
	// @AfterEach  - Runs after each test
	
	public ArrayList<String> testList = new ArrayList<>();
	
	@BeforeAll
	public void setup() {
		
		System.out.println("Setting up environment");
		testList.add("new data 1");
		testList.add("new data 2");
		
	}
	
	@BeforeEach
	public void setupTest() {
		
		// Before each test, clear all data from arraylist and add two new strings
		testList.clear(); // clearing all data
		testList.add("new data 1");
		testList.add("new data 2");
		System.out.println("Individual test environment setup");
	}
	
	@AfterEach
	public void teardownTest() {
		// Clear data from environment between tests
		System.out.println("Runs after each test");
	}
	
	@AfterAll
	public void teardown() {
		// Destory objects we don't need, clear entire arrays
		System.out.println("Runs at the very end");
	}
	
	@Disabled // Tells Eclipse this test isn't to be included fully
	@Test
	public void badTest() {
		String result = "red";
		
		Assertions.assertEquals("blue", result); // this will fail our test suite
	}
	
	@Test
	public void aRemoveTest() {
		String result;
		
		// result = the element we are removing at index 1
		result = testList.remove(1);
		
		Assertions.assertEquals("new data 2", result);
	}
	
	@Test
	public void firstTest() {
		String result;
		
		result = testList.remove(0);
		
		Assertions.assertEquals("new data 1", result);
	}
	
	@Test
	public void secondTest() {
		String result;
		
		result = testList.get(1);
		
		Assertions.assertEquals("new data 2", result);
	}
	
	// JUnit runs the tests semi randomly
	// The secondTest() relies on there being two indexes, the removal could stop it from working

}
