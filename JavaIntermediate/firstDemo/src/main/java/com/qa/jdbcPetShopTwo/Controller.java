package com.qa.jdbcPetShopTwo;

import java.util.ArrayList;

public class Controller {
	
	private PetShop petShop;

	public Controller(PetShop petShop) {
		super();
		this.petShop = petShop;
	}
	
	public Bird create(Bird bird) {
		Bird addedBird = petShop.addBird(bird);
		System.out.println(bird.getName() + " added to petshop!");
		return addedBird;
	}
	
	public Bird readId(int id) {
		Bird bird = petShop.getBirdById(id);
		return bird;
	}
	
	public ArrayList<Bird> readAll(){
		ArrayList<Bird> data = new ArrayList<>();
		return data;
	}
	
	public boolean deleteId(int id) {
		boolean result = petShop.deleteBirdById(id);
		return result;
	}
	
	
	
	

}
