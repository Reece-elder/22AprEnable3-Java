package com.qa.jdbcPetShop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PetShop {
	
	
	DBConfig db = new DBConfig();
	
//	Statement stmt = null;
	Connection conn = db.connect();
	
	// Add Bird to PetShop
	public boolean addBird(Bird bird) {
		try {
			String query = "INSERT INTO birds(feather_colour, wingspan, name) VALUES(?, ?, ?);";
			PreparedStatement preStmt = conn.prepareStatement(query); // takes in our sql query
			preStmt.setString(1, bird.getFeatherColour()); // set the first ? to have our bird colour
			preStmt.setInt(2, bird.getWingspan());
			preStmt.setString(3, bird.getName());
			preStmt.executeUpdate(); // run the sql query, adding to the db
			// executeUpdate() - Changing data: Posting, Updating, Deleting 
			// executeQuery()  - Getting data: reading (SELECT * FROM) 
			return true;
		} catch (Exception e) {
			// Exceptions are errors in the code
			// When an error is 'thrown', it is 'caught'
			e.printStackTrace(); // print out the error
			return false;
		}
		
	}
	
	public Bird getBirdById(int id) {
		try {
			String query = "SELECT * FROM birds where id = ?;";
			PreparedStatement preStmt = conn.prepareStatement(query);
			preStmt.setInt(1, id);
			ResultSet results = preStmt.executeQuery();
			return modelBird(results); // return what modelBird() returns, passing in our resultset
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean deleteBirdById(int id) {
		try {
			String query = "DELETE FROM birds where id = ?;";
			PreparedStatement preStmt = conn.prepareStatement(query);
			preStmt.setInt(1, id);
			preStmt.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Bird updateBirdById(int id, Bird bird) {
		try {
			String query = "UPDATE birds set feather_colour = ?, wingspan = ?, name = ? WHERE id = ?;";
			PreparedStatement preStmt = conn.prepareStatement(query);
			preStmt.setString(1, bird.getFeatherColour());
			preStmt.setInt(2, bird.getWingspan());
			preStmt.setString(3, bird.getName());
			preStmt.setInt(4, id);
			preStmt.executeUpdate();
			return getBirdById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public Bird modelBird(ResultSet result) {
		try { 
			int id = result.getInt("id"); // get by column number OR column name
			String featherColour = result.getString("feather_colour"); 
			// featherColour -> FEATHERCOLOUR (within SQL) FEATHER_COLOUR
			int wingspan = result.getInt("wingspan");
			String name = result.getString("name");
			
			// Make our bird object and return
			Bird bird = new Bird(id, featherColour, wingspan, name);
			return bird;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	

}
