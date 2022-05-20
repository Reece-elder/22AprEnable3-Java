package com.qa.jdbcPetShopTest;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.jdbcPetShop.Bird;
import com.qa.jdbcPetShop.DBConfig;
import com.qa.jdbcPetShop.PetShop;



public class PetShopTest {
	
	// Create my object I wish to test (It's not a mock.. just a regular object)
	PetShop shop = new PetShop();
	
	// Create a Database config object
	DBConfig db = new DBConfig();
	Connection conn = db.connect();
	
	// Global test Birds 
	Bird bird2 = new Bird("test colour 2", 2, "test name 2");
	Bird bird2ID = new Bird(2, "test colour 2", 2, "test name 2");
	Bird bird1ID = new Bird(1, "test colour", 1, "test name"); // our first bird with id
	
	
	// Before each is going to clear the database and add two entries before each test
	// Each test has the exact same environment as each other
	@BeforeEach
	public void setup() {
		// truncate - reset the table -> insert two new values 
		try {
			String query1 = "TRUNCATE TABLE birds;";
			String query2 = "INSERT INTO birds(feather_colour, wingspan, name) VALUES('test colour', 1, 'test name');";
			PreparedStatement preStmt1 = conn.prepareStatement(query1);
			PreparedStatement preStmt2 = conn.prepareStatement(query2);
			preStmt1.executeUpdate();
			preStmt2.executeUpdate();
			// Reset my database and add a test value
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void addBirdTest() {
		// When we add a bird, it will return the bird we just added
		// Arrange
		Bird result;
		
		// Act
		result = shop.addBird(bird2);
		
		// Assert 
		// When comparing objects, they may have the same value but Java doesnt recognise as the same thing
		// To fix this we add an equals() method to our Bird
		Assertions.assertEquals(bird2ID, result);
		
	}
	
	@Test
	public void getBirdByIDTest() {
		
		// Works the same as
		Assertions.assertEquals(bird1ID, shop.getBirdById(1));
		
		
		// Arrange
		Bird result;
		int id = 1;
		
		// Act 
		// Get the bird of ID 1
		result = shop.getBirdById(id);
		
		// Assert
		// When we pull from the DB, it has an ID
		Assertions.assertEquals(bird1ID, result);
		
	}

	
	
	
}
