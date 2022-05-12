package com.qa.main.day4.encapsulation;

public class Pizza {
	
	// Fields - Attributes
	private String type;
	private int size; 
	private boolean stuffedCrust;
	
	// Constructor using my fields
	public Pizza(String type, int size, boolean stuffedCrust) {
		super();
		this.type = type;
		this.size = size;
		this.stuffedCrust = stuffedCrust;
	}
	
	// Encapsulation - Getters and Setters (right click > source > generate getters and setters)

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		
		// Restrict you to adding a pizza of size 7 - 15
		if(size >= 7 && size <= 15) {
			this.size = size;
		} else {
			System.out.println("Thats a stupid size, make it between 7 - 15!!!");
		}
		
	}

	public boolean isStuffedCrust() {
		return stuffedCrust;
	}

	public void setStuffedCrust(boolean stuffedCrust) {
		this.stuffedCrust = stuffedCrust;
	} 
	
	
	
	
	
	

}
