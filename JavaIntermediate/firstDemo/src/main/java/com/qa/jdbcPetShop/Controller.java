package com.qa.jdbcPetShop;

// This class handles the user input side of the app
// At the moment it doesn't take in any user input, but it will be calling the PetShop methods

public class Controller {
	
	// The same way as creating an object with a constructor
	
	private PetShop petShop;

	// Constructor for my Controller
	public Controller(PetShop petShop) {
		super();
		this.petShop = petShop;
	}
	
	// Include functionality to interact such as: 
	// Typing commands in the console to choose a method
	// Accessing this method via HTTP www.project.com/addBird
	// A different programming language accessing this app
	
	// At the minute this controller doesn't include 'real' functionality
	
	// Petshop    = Messy and loud kitchen
	// Controller = Menu / waiter 
	
	// addABird()
	public Bird createBird(Bird bird) {
		Bird addedBird = petShop.addBird(bird); // Telling our petShop to run the addBird() 
		System.out.println(bird.getName() + " added to petshop!");
		return addedBird;
	}
	
	// getBirdID()
	public Bird readBirdById(int id) {
		Bird bird = petShop.getBirdById(id); // passing in our id to the petshop.getBirdById()
		return bird; 
	}
	
	// testing a boolean value is fine, as long as you're testing for: what you are hoping to return
	// and not what you're NOT hoping to return 
	
	// 1 - 50 numGen 
	// better to test if num == 12 than testing num != 10
	
	// deleteBird()
	public boolean deleteBird(int id) {
		
		// Something to react when an event is triggered
		// some method to check the console, and if someone has entered 'Delete'
		
		boolean deleted = petShop.deleteBirdById(id);
		System.out.println("bird of id: " + id + " has been removed :( ");
		return deleted;
	}
	
	// updateBird()
	public Bird updateBird(int id, Bird bird) {
		Bird updatedBird = petShop.updateBirdById(id, bird);
		System.out.println(bird.getName() + " has been updated!");
		return updatedBird;
	}
	
	
	
	

}
