package com.qa.jdbcPetShop;

import java.util.Scanner;

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
		
//		controller.createBird(new Bird("Purple", 13, "Toni"));
//		System.out.println(controller.readBirdById(19));
//		controller.deleteBird(19);
//		controller.updateBird(20, new Bird("White", 21, "Derrick"));
		
//		System.out.println(paws.addBird(new Bird("Green and Orange", 9, "Katie")));
		
//		System.out.println(new Bird("black", 19, "Hades").makeNoise());
		
//		System.out.println(paws.getBirdById(1));
		
		
		// Create a Scanner Object that will read the console (how your project next week will work)
		// System.in -> Entering data via the console
		Scanner newScan = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = newScan.nextLine(); // Whatever the user enters into the console will be saved as name
		
		System.out.println("Welcome " + name + " to the cool pet shop!");
		System.out.println("What do you wish to do?");
		System.out.println("CREATE");
		System.out.println("READ");
		System.out.println("UPDATE");
		System.out.println("DELETE");
		
		String option = newScan.nextLine();
		System.out.println(option);
		
		// .equals() tends to work better with Strings (and other objects)
		if (option.toLowerCase().equals("create")){
			controller.createBird(new Bird("red", 12, name));
		} else if(option.toLowerCase().equals("read")) {
			System.out.println(controller.readBirdById(1));
		} else if(option.toLowerCase().equals("update")) {
			controller.updateBird(1, new Bird("Blue", 13, "not reece"));
		} else if(option.toLowerCase().equals("delete")) {
			controller.deleteBird(1);
		} else {
			System.out.println("Please enter a valid answer");
		}
		
		
		

	}

}
