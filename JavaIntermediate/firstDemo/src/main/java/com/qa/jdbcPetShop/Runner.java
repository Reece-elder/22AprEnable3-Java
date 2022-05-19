package com.qa.jdbcPetShop;

public class Runner {
	
	// Petshop uses a db to store pets
	// Create
	// Read
	// Update
	// Delete
	// PetNoise() 
	
	public static void main(String[] args) {
		
		// Create my PetShop object
		PetShop paws = new PetShop();
		
		System.out.println(paws.addBird(new Bird("Green and Orange", 9, "Katie")));
		

	}

}
