package com.qa.main.day4.inheritence;

public class Runner {

	public static void main(String[] args) {
		
		// Penguin has a datatype of Penguin
		Penguin pingu = new Penguin("black and white", "Fish", 27, 5);
		Eagle eddie = new Eagle("Grey", "rodents and lizards", 36, 85);
		
		System.out.println(pingu.layEgg());
		System.out.println(pingu.getFeatherColour());
		System.out.println(pingu.swim());
//		System.out.println(pingu.screech()); // Method is specific to the eagle, penguin can't see it
		

	}

}
