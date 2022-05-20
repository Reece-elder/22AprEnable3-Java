package com.qa.jdbcPetShopTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.qa.jdbcPetShop.Bird;
import com.qa.jdbcPetShop.Controller;
import com.qa.jdbcPetShop.PetShop;

// Ctrl + Shift + O 
// Auto imports everything we need (it chooses the first option.. which could be wrong)

// Mockito test we need the extendwith annotations
@ExtendWith(MockitoExtension.class)
public class ControllerTest {
	
	// Creates a Mock object of our PetShop
	@Mock
	private PetShop mockShop;
	
	// Creates an object of our controller, passing in the mock object
	// Uses the Controllers constructor to pass in the mock object
	@InjectMocks
	private Controller controller;
	
	// TestDB, because we don't want to affect and delete all data in the real database
	// Because we are mocking our mockShop we won't be pushing or pulling any actual data 
	
	// Make some bird examples I can pass in
	Bird bird1 = new Bird("test colour", 1, "test name");     // pre database
	Bird bird1ID = new Bird(1,"test colour", 1, "test name"); // post database
	Bird bird5ID = new Bird(5,"test colour", 1, "test name");
	
	@Test
	public void createBirdTest() {
		
		// Arrange
		// Method takes in a bird object, 
		// passes it into the database then pulls the latest bird from the db
		Mockito.when(mockShop.addBird(bird1)).thenReturn(bird1ID);
		Bird result;
		
		// Act - Pass in bird1, as it hasn't gone into the database yet
		// createBird() essentially converts from bird1 -> bird1ID
		result = controller.createBird(bird1);
		
		// Assert
		Assertions.assertEquals(bird1ID, result);
		
		// Behavioural Assertions
		// verify takes in: object we are mocking, what we are checking for
		Mockito.verify(mockShop, Mockito.times(1)).addBird(bird1);
		Mockito.verify(mockShop, Mockito.atLeast(1)).addBird(bird1);
		Mockito.verify(mockShop, Mockito.atLeastOnce()).addBird(bird1);
		Mockito.verify(mockShop, Mockito.atMostOnce()).addBird(bird1);
		Mockito.verify(mockShop, Mockito.never()).addBird(bird1ID);
		
	}
	
	@Test
	public void readByIDTest() {
		
		// Arrange
		// What are we wanting Mockito to mock for us?
		Mockito.when(mockShop.getBirdById(1)).thenReturn(bird1ID);
		Bird result;
		
		// Act
		result = controller.readBirdById(1);
		
		// Assert
		Assertions.assertEquals(bird1ID, result);
		
		Mockito.verify(mockShop, Mockito.times(1)).getBirdById(1);
		Mockito.verify(mockShop, Mockito.never()).addBird(bird1);		
		
		
	}

}
