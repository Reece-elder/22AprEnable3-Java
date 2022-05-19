package com.qa.mockitoTesting;

import java.util.Random;

public class CoinFlipManager {
	
	// Making a method that returns HEADS, TAILS or EDGE depending on a RNG (random number gen)
	
	// Making a Random object called rng
	Random rng = new Random();
	
	// Mockito mocks the fixVehicle() (of the vehicle) so we test the garage 
	// Mockito returns a mock value for the vehicle
	
	public String coinFlip() {
		
		// Random is an object for creating random values 
		// nextInt() is a method (of Random) that generates a random number from 0 - max Number
		// Generate a random number from 0 - 100 (max num - 1)
		int randNum = rng.nextInt(101);
		
		if(randNum <= 49) {
			return "HEADS";
		} else if(randNum <= 99) {
			return "TAILS";
		} else if(randNum == 100) {
			return "EDGE";
		}
		
		return null;
	}

}
