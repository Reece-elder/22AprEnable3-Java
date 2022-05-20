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
		
		Controller controller = new Controller(paws);
		
		controller.createBird(new Bird("Purple", 13, "Toni"));
		System.out.println(controller.readBirdById(19));
		controller.deleteBird(19);
		controller.updateBird(20, new Bird("White", 21, "Derrick"));
		
//		System.out.println(paws.addBird(new Bird("Green and Orange", 9, "Katie")));
		
//		System.out.println(new Bird("black", 19, "Hades").makeNoise());
		
//		System.out.println(paws.getBirdById(1));
		

	}

}
